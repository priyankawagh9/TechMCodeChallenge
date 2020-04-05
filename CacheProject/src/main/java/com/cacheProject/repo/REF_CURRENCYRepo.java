package com.cacheProject.repo;

import java.util.Date;
import java.util.HashMap;

import org.springframework.stereotype.Component;

import com.cacheProject.model.REF_CURRENCY;

@Component
public class REF_CURRENCYRepo {
	public REF_CURRENCY getREF_CURRENCY(Integer CURRENCY_ID) {
		return new REF_CURRENCY(CURRENCY_ID, "CURR_CD_"+CURRENCY_ID, "CURR_NAME"+CURRENCY_ID, "CURR_SYB"+CURRENCY_ID, CURRENCY_ID,  new Date(System.currentTimeMillis()*10), CURRENCY_ID);
	}

}
