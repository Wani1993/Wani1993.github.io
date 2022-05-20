// 정수 2개를 입력받아서 큰 수에서~ 작은 수로 나눈 몫과 나머지를 출력

import java.util.Scanner;

public class IfEven3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수 2개를 입력하세요");
		int a = input.nextInt();
		int b = input.nextInt();
		int div;
		int mod;
		
		if (a != 0 && b != 0) {
			if (a > b) {
				// a / b, a % b 계산하기
				div = a / b;
				mod = a % b;
			} else {
				// b / a, b % a 계산하기
				div = b / a;
				mod = b % a;
			}
			
			System.out.println("몫: " + div);
			System.out.println("몫: " + mod);
			
			// if (a > b) {
				// System.out.println("몫: " + a / b);
				// System.out.println("나머지: " + a % b);
			// } else {
				// System.out.println("몫: " + b / a);
				// System.out.println("나머지: " + b % a);
			// }
		} else {
			System.out.println("0을 입력하면 안되!");
		}
		
		System.out.println("프로그램 종료");
		
    }
}