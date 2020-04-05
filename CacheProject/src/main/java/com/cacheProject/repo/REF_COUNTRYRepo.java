package com.cacheProject.repo;

import java.util.Date;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.cacheProject.model.REF_COUNTRY;

@Repository
public class REF_COUNTRYRepo {

	public REF_COUNTRY getREF_COUNTRY(Integer COUNTRY_ID) {
		return new REF_COUNTRY(COUNTRY_ID, "CNTRY_CD_"+COUNTRY_ID, "COUNTRY_NAME"+COUNTRY_ID, COUNTRY_ID, new Date(System.currentTimeMillis()*10), COUNTRY_ID);
	}

}
