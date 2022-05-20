// 사용자의 점수(정수형)을 입력받아
// 60점 이상이면 "합격" 출력
// 60점 미만이면 "불합격" 문자열과 부족한 점수도 같이 출력

import java.util.Scanner;

public class IfEven2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int a = input.nextInt();
		
		if (a >= 60) {
		    System.out.println("합격");
		} else {
			System.out.println("불합격");
			System.out.println("부족한 점수: " + (60 - a));
		}
		
		System.out.println("프로그램 종료");
	}
}