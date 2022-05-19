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

        System.out.print(big + "을 " + small + "으로 나눈 몫은 " + division + "이고 나머지는 " + changes + "입니다." );
		
		// System.out.printf("%d을 %d으로 나눈 몫은 %d이고 나머지는 %d입니다.", big, small, big / small, big % small);
		// System.out.printf("%dHello %dWorld%d\n", 1, 2, 3); // %d 숫자가 들어올 자리, 맨위에 \n은 줄바꿈을 해주는 명령어 (printf에만 사용이 가능하다.)
		// System.out.printf("%dHello %dWorld%d", 4, 5, 6);
	}
}