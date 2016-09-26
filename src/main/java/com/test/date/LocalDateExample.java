package com.test.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Today's Local date : " + today);

		System.out.println("First Day Of Month: "
				+ today.with(TemporalAdjusters.firstDayOfMonth()));

		System.out.println("Last Day Of Month: "
				+ today.with(TemporalAdjusters.lastDayOfMonth()));

		System.out.println("First Day Of Next Month: "
				+ today.with(TemporalAdjusters.firstDayOfNextMonth()));

		System.out.println("First Day Of Next Year: "
				+ today.with(TemporalAdjusters.firstDayOfNextYear()));

		System.out.println("First Day Of Year: "
				+ today.with(TemporalAdjusters.firstDayOfYear()));

		System.out.println("Next Day Of Week: "
				+ today.with(TemporalAdjusters.next(DayOfWeek.MONDAY)));
		
		System.out.println(DayOfWeek.of(1));
	}

}
