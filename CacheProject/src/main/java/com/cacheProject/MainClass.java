package com.cacheProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cacheProject.model.REF_COUNTRY;
import com.cacheProject.model.REF_CURRENCY;
import com.cacheProject.model.REF_HOLIDAY;
import com.cacheProject.service.REF_COUNTRYService;
import com.cacheProject.service.REF_CURRENCYService;
import com.cacheProject.service.REF_HOLIDAYService;

@Component
public class MainClass {
	
	@Autowired
	REF_COUNTRYService rEF_COUNTRYService;
	
	@Autowired
	REF_CURRENCYService rEF_CURRENCYService;
	
	@Autowired
	REF_HOLIDAYService rEF_HOLIDAYService;
		
	public void startMethod() throws ClassNotFoundException {
		System.out.println("\n\n\n");
		REF_COUNTRY_SampleExecutor();
		System.out.println("\n\n\n");
		REF_CURRENCY_SampleExecutor();
		System.out.println("\n\n\n");
		REF_HOLIDAY_SampleExecutor();
		System.out.println("\n\n\n");
		
		REF_HOLIDAY REF_HOLIDAY9= rEF_HOLIDAYService.getREF_HOLIDAY("REF_HOLIDAY", 5);
		REF_CURRENCY REF_CURRENCY6= rEF_CURRENCYService.getREF_CURRENCY("REF_CURRENCY", 7);
		REF_COUNTRY REF_COUNTRY3= rEF_COUNTRYService.getCOUNTRY("REF_COUNTRY", 3);
		
	}

	private void REF_HOLIDAY_SampleExecutor() {
		REF_HOLIDAY REF_HOLIDAY= rEF_HOLIDAYService.getREF_HOLIDAY("REF_HOLIDAY", 1);
		REF_HOLIDAY REF_HOLIDAY1= rEF_HOLIDAYService.getREF_HOLIDAY("REF_HOLIDAY", 2);
		REF_HOLIDAY REF_HOLIDAY2= rEF_HOLIDAYService.getREF_HOLIDAY("REF_HOLIDAY", 1);
		REF_HOLIDAY REF_HOLIDAY4= rEF_HOLIDAYService.getREF_HOLIDAY("REF_HOLIDAY", 3);
		REF_HOLIDAY REF_HOLIDAY3= rEF_HOLIDAYService.getREF_HOLIDAY("REF_HOLIDAY", 4);
		REF_HOLIDAY REF_HOLIDAY7= rEF_HOLIDAYService.getREF_HOLIDAY("REF_HOLIDAY", 3);
		REF_HOLIDAY REF_HOLIDAY8= rEF_HOLIDAYService.getREF_HOLIDAY("REF_HOLIDAY", 3);
		REF_HOLIDAY REF_HOLIDAY9= rEF_HOLIDAYService.getREF_HOLIDAY("REF_HOLIDAY", 5);
		REF_HOLIDAY REF_HOLIDAY5= rEF_HOLIDAYService.getREF_HOLIDAY("REF_HOLIDAY",1);
		REF_HOLIDAY REF_HOLIDAY6= rEF_HOLIDAYService.getREF_HOLIDAY("REF_HOLIDAY", 7);
		
	}

	private void REF_CURRENCY_SampleExecutor() {
		REF_CURRENCY REF_CURRENCY= rEF_CURRENCYService.getREF_CURRENCY("REF_CURRENCY", 1);
		REF_CURRENCY REF_CURRENCY1= rEF_CURRENCYService.getREF_CURRENCY("REF_CURRENCY", 2);
		REF_CURRENCY REF_CURRENCY2= rEF_CURRENCYService.getREF_CURRENCY("REF_CURRENCY", 1);
		REF_CURRENCY REF_CURRENCY4= rEF_CURRENCYService.getREF_CURRENCY("REF_CURRENCY", 3);
		REF_CURRENCY REF_CURRENCY3= rEF_CURRENCYService.getREF_CURRENCY("REF_CURRENCY", 4);
		REF_CURRENCY REF_CURRENCY7= rEF_CURRENCYService.getREF_CURRENCY("REF_CURRENCY", 3);
		REF_CURRENCY REF_CURRENCY8= rEF_CURRENCYService.getREF_CURRENCY("REF_CURRENCY", 3);
		REF_CURRENCY REF_CURRENCY9= rEF_CURRENCYService.getREF_CURRENCY("REF_CURRENCY", 5);
		REF_CURRENCY REF_CURRENCY5= rEF_CURRENCYService.getREF_CURRENCY("REF_CURRENCY",1);
		REF_CURRENCY REF_CURRENCY6= rEF_CURRENCYService.getREF_CURRENCY("REF_CURRENCY", 7);
		
	}

	private void REF_COUNTRY_SampleExecutor() {
		REF_COUNTRY REF_COUNTRY= rEF_COUNTRYService.getCOUNTRY("REF_COUNTRY", 1);
		REF_COUNTRY REF_COUNTRY1= rEF_COUNTRYService.getCOUNTRY("REF_COUNTRY", 2);
		REF_COUNTRY REF_COUNTRY2= rEF_COUNTRYService.getCOUNTRY("REF_COUNTRY", 1);
		REF_COUNTRY REF_COUNTRY4= rEF_COUNTRYService.getCOUNTRY("REF_COUNTRY", 3);
		REF_COUNTRY REF_COUNTRY3= rEF_COUNTRYService.getCOUNTRY("REF_COUNTRY", 4);
		REF_COUNTRY REF_COUNTRY7= rEF_COUNTRYService.getCOUNTRY("REF_COUNTRY", 3);
		REF_COUNTRY REF_COUNTRY8= rEF_COUNTRYService.getCOUNTRY("REF_COUNTRY", 3);
		REF_COUNTRY REF_COUNTRY9= rEF_COUNTRYService.getCOUNTRY("REF_COUNTRY", 5);
		REF_COUNTRY REF_COUNTRY5= rEF_COUNTRYService.getCOUNTRY("REF_COUNTRY",1);
		REF_COUNTRY REF_COUNTRY6= rEF_COUNTRYService.getCOUNTRY("REF_COUNTRY", 7);
		
	}
}	
	
	
