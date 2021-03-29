package com.viswa.enumsInJava;

public enum DaysInAWeek implements Week {

	MONDAY,TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY,SATURDAY,SUNDAY;

	@Override
	public int day() {
		return this.ordinal()+1;
	}
	
	
}
