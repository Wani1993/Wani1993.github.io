// 사용자가 입력한 정수가
// 짝수면 true
// 홀수면 false를 출력해보세요.
import java.util.Scanner;

public class prc3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int a = input.nextInt();
		
		boolean result = (a % 2 == 0);
		System.out.println("답은?" + result);
	}
}