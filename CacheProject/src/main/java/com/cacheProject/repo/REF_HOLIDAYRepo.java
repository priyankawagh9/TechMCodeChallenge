package com.cacheProject.repo;

import java.util.Date;
import java.util.HashMap;

import org.springframework.stereotype.Component;

import com.cacheProject.model.REF_HOLIDAY;

@Component
public class REF_HOLIDAYRepo {

	public REF_HOLIDAY getREF_HOLIDAY(Integer HOLIDAY_ID) {
		return new REF_HOLIDAY(HOLIDAY_ID, "HLD_CD_"+HOLIDAY_ID, "HLD_NAME"+HOLIDAY_ID, new Date(System.currentTimeMillis()*10), HOLIDAY_ID, new Date(System.currentTimeMillis()*1), HOLIDAY_ID);
	}
}
