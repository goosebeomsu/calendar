package gb.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		System.out.println(input);
		
		String[] inputArr = input.split(" ");
		
		int first = Integer.parseInt(inputArr[0]);
		int second = Integer.parseInt(inputArr[1]);
		
		System.out.printf("두 수의 합은 %d입니다",first+second);
		scanner.close();

	}

}
