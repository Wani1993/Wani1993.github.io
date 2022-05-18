// 101쪽 2번문제
import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오: ");
		int big = input.nextInt();
		System.out.print("정수를 입력하시오: ");
		int small = input.nextInt();
        int division = big / small;
		int changes = big % small;


        System.out.print(big + "을" + small + "으로 나눈 몫은 " + division + "이고 나머지는" + changes + "입니다." );

	}
}