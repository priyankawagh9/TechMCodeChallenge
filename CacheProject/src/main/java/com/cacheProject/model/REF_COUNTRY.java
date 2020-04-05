package com.cacheProject.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class REF_COUNTRY {
	int COUNTRY_ID;
	String COUNTRY_CD;
	String COUNTRY_NAME;
	int STATUS_IND;
	Date LAST_MODIFY_DT;
	int MODIFY_PERSON_NUM;

}
