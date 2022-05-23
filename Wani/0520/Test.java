// 정수 2개와 연산자(문자열)등 을 입력받아 사칙연산을 수행하는 계산기 프로그램

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오: ");
		int a = input.nextInt();
		System.out.println("사칙연산을 입력하시오: ");
		input.nextLine();
		String name = input.nextLine();
		System.out.println("숫자를 입력하시오: ");
		int b = input.nextInt();
		
		
		String answer;
	    if (name.equals("+")) {
			answer = "" + (a + b);
		} else if (name.equals("-")) {
			answer = "" + (a - b);
		} else if (name.equals("*")) {
			answer = "" + (a * b);
		} else if (name.equals("/")) {
			answer = "" + (a / b);
		}
		System.out.println("답은: " + answer);
	}
}