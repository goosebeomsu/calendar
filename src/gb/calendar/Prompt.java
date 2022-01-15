package gb.calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";

	public void runPrompt() {
		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램

		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 1;
		while (true) {
			System.out.println("달을 입력하세요.");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			if (month == -1) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (!(1 <= month && month <= 12)) {
				System.out.println("1~12사이 숫자를 입력하세요");
				continue;
			}

			cal.printCalendar(2021, month);
			System.out.println();

		}

	}

	public static void main(String[] args) {

		Prompt p = new Prompt();
		p.runPrompt();
	}

}
