// 3. 사용자가 입력한 4자리의 정수가 좌우가 같을 때 true를 출력하세요. 나머지 경우는 false
// 예) 1221 -> true, 1557 -> false, 9009 -> true
import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("4자리 정수를 입력하세요: ");
		int a = input.nextInt();
		
		int num1 = a % 10;
		int num2 = (a / 10) % 10;
		int num3 = (a / 100) % 10;
	    int num4 = (a / 1000);
		
		boolean result = (num1 == num4 && num2 == num3);
        System.out.println("좌우 대칭인가? " + result);		
	}
}