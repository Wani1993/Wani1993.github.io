// 사용자가 입력한 정수가 소수임을 확인하여 출력하는 프로그램
import java.util.Scanner;

public class prc4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요: ");
		int x = scan.nextInt();
		
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				System.out.println("소수가 아닙니다.");
				break;
			} else if (x / x == 1) {
				System.out.println("소수 입니다.");
				break;
			}
		}
	}
}