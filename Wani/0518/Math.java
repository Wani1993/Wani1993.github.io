// 사용자에게 국어,영어,수학 점수를 정수로 입력받아
// 총점과 평균점수를 출력하는 프로그램

import java.util.Scanner;

public class Math {
	public static void main(String[] args) {
		
		System.out.println("국어, 영어, 수학 점수의 평균점수");
		
		Scanner input = new Scanner(System.in);
		int kor;
		int eng;
		int math;
		
		System.out.print("국어점수: ");
		kor = input.nextInt();
		System.out.print("영어점수: ");
		eng = input.nextInt();
		System.out.print("수학점수: ");
		math = input.nextInt();
		
		int sum = kor + eng + math;
		int avg = sum / 3;
		
		System.out.println("합은: " + sum);
		System.out.println("평균은: " + avg );
		
	}
}