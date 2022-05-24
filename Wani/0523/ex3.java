// 사용자가 입력한 5개의 정수 중 가장 큰 수를 출력하세요.
import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 5개를 입력하세요.");
		int max;
		int first = scan.nextInt();
		max = first;
		
		for (int i = 0; i < 4; i++) {
			int next = scan.nextInt();
			
			if(max < next) {
				max = next;
			}
		}
		System.out.println("제일 큰 수는: " + max);
		
	}
}