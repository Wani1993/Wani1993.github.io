// 사용자가 입력한 원하는 반복 만큼만.
// 0부터 1씩 증가하는 수를 출력하기.

import java.util.Scanner;

public class Number {
	public static void main(String[] arsg) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("원하는 횟수를 입력하시오: ");
		int a = input.nextInt();
		
		int b = 0;
		while(b <= a) {
			System.out.println(b);
			b++; 
		}
		
	}
}
