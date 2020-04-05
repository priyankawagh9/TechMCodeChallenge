package com.cacheProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cacheProject.cache.CacheService;
import com.cacheProject.model.REF_COUNTRY;
import com.cacheProject.repo.REF_COUNTRYRepo;

@Component
public class REF_COUNTRYService {
	@Autowired
	REF_COUNTRYRepo repo;
	
	@Autowired
	CacheService<REF_COUNTRY, Integer> cacheService;
	
	public REF_COUNTRY getCOUNTRY(String cacheName, Integer COUNTRY_ID) {
		 REF_COUNTRY rEF_COUNTRY;

		if ((rEF_COUNTRY = (cacheService.getfromCache(cacheName, COUNTRY_ID))) == null) {
			// if return from cache is null; fetch data from Repository/db
			rEF_COUNTRY = repo.getREF_COUNTRY(COUNTRY_ID);

			//System.out.println("feching rEF_COUNTRY record from database "+rEF_COUNTRY);
			// add newly found not-null data from db/repo into cache:
			if (rEF_COUNTRY != null) {
				cacheService.putIntoCache(cacheName, COUNTRY_ID, rEF_COUNTRY);
				System.out.println("New rEF_COUNTRY record added to cache "+rEF_COUNTRY);
			}
			return rEF_COUNTRY;
		}
		System.out.println("feching rEF_COUNTRY record from cache "+rEF_COUNTRY);
		return rEF_COUNTRY;
	}	
}
