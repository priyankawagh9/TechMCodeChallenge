package com.cacheProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cacheProject.cache.CacheService;
import com.cacheProject.model.REF_HOLIDAY;
import com.cacheProject.repo.REF_HOLIDAYRepo;

@Component
public class REF_HOLIDAYService {
	@Autowired
	REF_HOLIDAYRepo repo;
	
	@Autowired
	CacheService<REF_HOLIDAY, Integer> cacheService;
	
	public REF_HOLIDAY getREF_HOLIDAY(String cacheName, Integer HOLIDAY_ID) {
		 REF_HOLIDAY rEF_HOLIDAY;

		if ((rEF_HOLIDAY = (cacheService.getfromCache(cacheName, HOLIDAY_ID))) == null) {
			// if return from cache is null; fetch data from Repository/db
			rEF_HOLIDAY = repo.getREF_HOLIDAY(HOLIDAY_ID);

			//System.out.println("feching rEF_HOLIDAY record from database "+rEF_HOLIDAY);
			// add newly found not-null data from db/repo into cache:
			if (rEF_HOLIDAY != null) {
				cacheService.putIntoCache(cacheName, HOLIDAY_ID, rEF_HOLIDAY);
				System.out.println("New rEF_HOLIDAY record added to cache "+rEF_HOLIDAY);
			}
			return rEF_HOLIDAY;
		}
		System.out.println("feching rEF_HOLIDAY record from cache "+rEF_HOLIDAY);
		return rEF_HOLIDAY;
	}	
}
