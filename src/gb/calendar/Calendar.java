package gb.calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] maxDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return maxDays[month - 1];

	}

	public void printCalendar(int year, int month) {
		System.out.printf("   <<%4d년 %2d월>>%n", year, month);
		System.out.println(" SU MO TU WE TH FR SA ");
		System.out.println("---------------------");

		int maxDay = getMaxDaysOfMonth(month);

		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == 0) {
				System.out.println();
			}
		}

	}

}