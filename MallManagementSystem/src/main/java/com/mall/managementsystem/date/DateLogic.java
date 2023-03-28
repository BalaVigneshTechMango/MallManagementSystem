package com.mall.managementsystem.date;

import java.util.Calendar;
import java.util.Date;

import com.mall.managementsystem.MallManagementSystemApplication;

public class DateLogic extends MallManagementSystemApplication {
	
	/**
	 * This method will return the date of 3 months before date of the current date
	 */
	public Date getDate() {
		Calendar calNow = Calendar.getInstance();
		calNow.add(Calendar.MONTH, -3);
		Date currentdatetime = calNow.getTime();
		return currentdatetime;
		
	}
	
	public Date getDateCurrent() {
		Calendar calNow = Calendar.getInstance();
		calNow.add(Calendar.MONTH, 0);
		Date currentdatetime = calNow.getTime();
		return currentdatetime;
	}
	
	
}
