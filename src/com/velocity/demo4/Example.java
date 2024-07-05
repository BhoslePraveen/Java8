package com.velocity.demo4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Example {

	public static void main(String[] args) {
//		Date date = new Date();
//		System.out.println(date);
//		System.out.println(date.getTime());
//
//		LocalTime localTime = LocalTime.now();
//		System.out.println(localTime);
//		LocalDate localDate = LocalDate.now();
//		System.out.println(localDate);
//		LocalDateTime dateTime = LocalDateTime.now();
//		System.out.println(dateTime);

		
		//DOB: 23-07-1995
//		LocalDate dob = LocalDate.of(1995, 07, 23);
//		LocalDate currentDate = LocalDate.now();
//		Period period = Period.between(dob, currentDate);
//		System.out.println(period);
//		System.out.println(period.getYears());
//		
//		LocalDateTime dateTime = LocalDateTime.now();
//		System.out.println(dateTime);
//		System.out.println(dateTime.minusHours(23));
		
		LocalDateTime idt = LocalDateTime.now();
		System.out.println(idt);
		
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		ZoneId us = ZoneId.of("America/Chicago");
		System.out.println(zdt.withZoneSameInstant(us));
		
		
	}

}
