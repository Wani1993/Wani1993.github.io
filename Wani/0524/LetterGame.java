import java.util.Scanner;
import java.util.Random;

public class LetterGame {
	public static void main(String[] args) {
		// Random random = new Random();
		// int number = random.nextInt(); 
		// System.out.println(number);
		
		Random random = new Random();
		int answer = random.nextInt(100);
		int guess;
		int tries = 0;
		Scanner scan = new Scanner(System.in);
		// 반복구조
		do {
			System.out.print("정답을 추측해봐: ");
			guess = scan.nextInt();
			tries++;
			
			if (guess > answer)
				System.out.println("너무 높아");
			if (guess < answer)
				System.out.println("너무 낮아");
		} while (guess != answer);
		
		System.out.printf("축하축하! 시도 횟수 = %d \n", tries);
	}
}