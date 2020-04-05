package com.cacheProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cacheProject.cache.CacheService;
import com.cacheProject.model.REF_CURRENCY;
import com.cacheProject.repo.REF_CURRENCYRepo;

@Component
public class REF_CURRENCYService {
	@Autowired
	REF_CURRENCYRepo repo;
	
	@Autowired
	CacheService<REF_CURRENCY, Integer> cacheService;
	
	public REF_CURRENCY getREF_CURRENCY(String cacheName, Integer CURRENCY_ID) {
		 REF_CURRENCY rEF_CURRENCY;

		if ((rEF_CURRENCY = (cacheService.getfromCache(cacheName, CURRENCY_ID))) == null) {
			// if return from cache is null; fetch data from Repository/db
			rEF_CURRENCY = repo.getREF_CURRENCY(CURRENCY_ID);

			//System.out.println("feching rEF_CURRENCY record from database "+rEF_CURRENCY);
			// add newly found not-null data from db/repo into cache:
			if (rEF_CURRENCY != null) {
				cacheService.putIntoCache(cacheName, CURRENCY_ID, rEF_CURRENCY);
				System.out.println("New rEF_CURRENCY record added to cache "+rEF_CURRENCY);
			}
			return rEF_CURRENCY;
		}
		System.out.println("feching rEF_CURRENCY record from cache "+rEF_CURRENCY);
		return rEF_CURRENCY;
	}	
}
