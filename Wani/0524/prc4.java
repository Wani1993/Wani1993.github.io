// 사용자가 입력한 정수가 소수임을 확인하여 출력하는 프로그램
import java.util.Scanner;

public class prc4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요: ");
		int x = scan.nextInt();
		
		int count = 0;
		for (int i = x; i > 0; i--) {
			if (x % i == 0) {
				System.out.println(x / i + " ");
				count++;
			}
		}
		
		if (count == 2) {
			System.out.print("소수입니다.");
		} else {
			System.out.print("소수가 아닙니다.");
		}
		
	}
}