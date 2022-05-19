// 사용자에게 정수 하나를 입력받아서
// 입력 값 -2 ~ +2 범위의 정수를 출력해보세요
// 예) 7 -> 5 6 7 8 9
import java.util.Scanner;

public class prc {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int a = input.nextInt();
		
		a -= 2;
		
		System.out.print(a);
		System.out.print(++a);
		System.out.print(++a);
		System.out.print(++a);
		System.out.print(++a);
	}
}