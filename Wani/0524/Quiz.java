// 2 ~ 9 까지의 무작위 수를 정하여
// 사용자가 해당하는 수의 배수를 순서대로 입력하게 하여
// 틀릴 경우 종료

// 예) 랜덤 수가 6일 경우

// 사용자가 입력
// 6 0
// 12 0
// 18 0
// 21 X 종료

import java.util.Scanner;
import java.util.Random;

public class Quiz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int a = random.nextInt(8);
		int b = a + 2;
		
		System.out.println(b + "의 배수를 입력하시오: " );
		
		int answer = 0;
		while (true) {
			answer += b;
			System.out.print("배수는? ");
			int userInput = scan.nextInt();
			
			if (answer != userInput) {
				break;
				
			}	
				
			System.out.println("그다음 ");	
		}
	    System.out.println("종료");
			
	}
		
}