// 사용자가 몇 개의 정수를 입력할지 먼저 정한 후.
// 정수를 입력하면
// 합과 평균을 구해서 출력하는 프로그램.

// 짝수
// 홀수
import java.util.Scanner;

public class SumNumUser {
	public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
		// System.out.println("몇개의 정수를 쓸것인가?");
		// int start = scan.nextInt();
		
		
		// int sum = 0;
		// for (int i = 0; i < start; i++) { // 입력한 정수 만큼 실행
			// // int num = scan.nextInt();
		    // sum += scan.nextInt();
		// }
		// int last = sum / start;
		// System.out.println("합은: " + sum + " " + "평균은: " + last);
		
	    Scanner scan = new Scanner(System.in);
		System.out.println("몇개의 정수를 쓸것인가?");
		int start = scan.nextInt();
		
		
		int sum = 0;
		int sum2 = 0;
		for (int i = 0; i < start; i++) { // 입력한 정수 만큼 실행
			int num = scan.nextInt();
		     if (num % 2 == 0) {
				 sum += num;
			 } else {
				 sum2 += num;
		   }
        }
		System.out.println("짝수 합은: " + sum);
	    System.out.println("홀수 합은: " + sum2);
		
	}
		
		// int last = sum / start;
		// System.out.println("합은: " + sum + " " + "평균은: " + last);
}	