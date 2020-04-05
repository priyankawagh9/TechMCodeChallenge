package com.cacheProject.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class REF_HOLIDAY {
	int HOLIDAY_ID;
	String HOLIDAY_CD;
	String HOLIDAY_NAME;
	Date HOLIDAY_DT;
	int STATUS_IND;
	Date LAST_MODIFY_DT;
	int MODIFY_PERSON_NUM;
}
