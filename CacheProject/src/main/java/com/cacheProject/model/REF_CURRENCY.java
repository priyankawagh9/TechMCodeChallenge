package com.cacheProject.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class REF_CURRENCY {
	int CURR_ID;
	String CURR_CD;
	String CURR_NAME;
	String CURRENCY_SYMBOL;
	int STATUS_IND;
	Date LAST_MODIFY_DT;
	int MODIFY_PERSON_NUM;
}
