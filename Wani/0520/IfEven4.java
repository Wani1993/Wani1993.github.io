// 3개의 정수를 입력받아
// 가장 큰 수를 출력하세요.

import java.util.Scanner;

public class IfEven4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력하세요:");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int max;
		
		if (a > b) {
			if (a > c) {
				max = a;
			} else {
				max = c;
			}
		} else {
			if (b > c) {
				max = b;
			} else {
				max = c;
			}
		}
		System.out.println("가장 큰수는 :" + max);
	}
}