import java.util.Scanner;

public class Gcd {
	public static void main(String[] args) {
		int x, y, r;  // 정수형 변수가 여러개 필요할때 쉼표로 나열할수있다.
		System.out.println("두 개의 정수를 입력하시오(큰수, 작은수): ");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();
		
		while (y != 0) {
			r = x % y;
			x = y;
			y = r;
		}
		System.out.printf("최대 공약수는 %d입니다.\n", x);
	}
}