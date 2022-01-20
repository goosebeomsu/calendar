package gb.calendar;

import java.util.Scanner;

public class Prompt {

	public int parseDay(String weekday) {
		if (weekday.equals("SU"))
			return 0;
		else if (weekday.equals("MO"))
			return 1;
		else if (weekday.equals("TU"))
			return 2;
		else if (weekday.equals("WE"))
			return 3;
		else if (weekday.equals("TH"))
			return 4;
		else if (weekday.equals("FR"))
			return 5;
		else if (weekday.equals("SA"))
			return 6;
		else
			return 0;
	}

	public void runPrompt() {
		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램

		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int year = 2021;
		int month = 1;
	
		while (true) {
			System.out.println("년도를 입력하세요.(exit: -1)");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			if (year == -1) {
				break;
			}

			System.out.println("월을 입력하세요.(exit: -1)");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
			if (month == -1) {
				break;
			} else if (!(1 <= month && month <= 12)) {
				System.out.println("1~12사이 숫자를 입력하세요");
				continue;
			}

			cal.printCalendar(year, month);
			System.out.println();

		}
		scanner.close();
		System.out.println("bye~");

	}

	public static void main(String[] args) {

		Prompt p = new Prompt();
		p.runPrompt();
	}

}
