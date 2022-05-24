// 사용자가 입력한 정수의 약수를 나열하고 총 개수를 출력하세요.
import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		int count = 0;
		for (int i = 1; i <= num; i++) { //  1에서부터 1씩 증가시키면서
			if (num % i == 0) {          // 입력한숫자에 나누기 i 를 했을때 나누어 떨어지는가
				System.out.println(i);
				count++;
			}
		}
		System.out.println("약수 개수: " + count);
	}
}