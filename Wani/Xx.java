// 사용자에게 정수 하나를 입력받아서
// 제곱 값을 출력하는 프로그램
import java.util.Scanner;

public class Xx {
	public static void main(String[] args) {
		System.out.println("제곱값구하기");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 하나를 입력하시오.");
		int x = input.nextInt();
		System.out.print("정수 하나를 입력하시오.");
		int y = input.nextInt();
		
		double result = Math.pow(x, y);
		
		System.out.print("x의y승: " );
		System.out.println(result);
	}
}