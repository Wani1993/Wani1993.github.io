// 2. 사용자에게 3개의 정수를 입력받아 순서대로 입력된 수일 경우 true를 출력하세요. 나머지 경우는 false
// 예) 1 2 3 -> true, 4 5 6 -> true, 7 9 10 -> false

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("3개의 정수를 입력하세요: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		boolean result = (++a) == b && (++b) == c;
		System.out.println("연속되는 숫자인가? " + result);
	}
}
