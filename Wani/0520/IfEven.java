// 사용자가 정수를 입력받아
// 짝수면 "짝수입니다." 출력하기
import java.util.Scanner;

public class IfEven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
	    int a = input.nextInt();
		
		
	  	if (a % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
		System.out.println("프로그램 종료");
	}
}