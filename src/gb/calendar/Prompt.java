package gb.calendar;

import java.util.Scanner;

public class Prompt {

	

	public void runPrompt() {
		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램

		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int year = 1;
		int month = 1;
		while (true) {
			System.out.println("년도를 입력하세요");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			System.out.println("월을 입력하세요.");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
			if (month == -1) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (!(1 <= month && month <= 12)) {
				System.out.println("1~12사이 숫자를 입력하세요");
				continue;
			}

			cal.printCalendar(year, month);
			System.out.println();
		

		}
		scanner.close();

	}

	public static void main(String[] args) {

		Prompt p = new Prompt();
		p.runPrompt();
	}

}
