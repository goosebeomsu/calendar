package gb.calendar;

public class Calendar {

	private static final int[] maxDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_maxDays = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int year) {
		if (year % 400 == 0) {
			return true;
		} else if (year % 100 == 0) {
			return false;
		} else if (year % 4 == 0) {
			return true;
		} else
			return false;

	}

	public int getMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year) == true) {
			return LEAP_maxDays[month - 1];
		} else {
			return maxDays[month - 1];
		}

	}

	public void printCalendar(int year, int month) {
		System.out.printf("   <<%4d년 %2d월>>%n", year, month);
		System.out.println(" SU MO TU WE TH FR SA ");
		System.out.println("---------------------");
		
		int weekday = getweekDay(year, month, 1);

		// print blank
		for (int i = 0; i < weekday; i++) {
			System.out.print("   ");
		}
		
		int maxDay = getMaxDaysOfMonth(year, month);
		int count = 7 - weekday;
		int delim = (count < 7) ? count : 0;
		
		//print first line
		for(int i = 1; i <= count; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();

        //print from second line to last
		for (int i = count + 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == delim) {
				System.out.println();
			}
		}
		System.out.println();
	}

	private int getweekDay(int year, int month, int day) {
		int syear = 1583;
		final int STANDARD_WEEKDAY = 6;
		
		int count_day = 0;
		
		for(int i = syear; i < year; i++) {
		  int delta = isLeapYear(i) ? 366 : 365;
		  count_day += delta;
		}
		
		for(int i = 1; i < month; i++) {
		  int delta = getMaxDaysOfMonth(year, i);
		  count_day += delta;
		}
		
		count_day += day - 1;
		
		int weekday = (count_day + STANDARD_WEEKDAY) % 7;
		return weekday;
		
	}

}
