// 사용자가 입력한 5자리의 정수를 역순으로 출력하는 프로그램

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		System.out.println("정수 역순으로 출력");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int some = input.nextInt();
		
		int num5 = some % 10;
		int num4 = (some / 10) % 10;
		int num3 = (some / 100) % 10;
		int num2 = (some / 1000) % 10;
		int num1 = (some / 10000) % 10;
	
	    System.out.print(num5);
		System.out.print(num4);
		System.out.print(num3);	
		System.out.print(num2);	
		System.out.print(num1);	
	}
}