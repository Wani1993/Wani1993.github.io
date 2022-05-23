import java.util.Scanner;

public class SumForUser {
	public static void main(String[] args) {
		// 사용자가 범위를 지정.(시작-끝 입력)
		// 해당 정수의 합
		Scanner input = new Scanner(System.in);
	
	    System.out.println("처음과 끝을 입력하세요: ");
		int a = input.nextInt();
		int b = input.nextInt();
		
		int sum = 0;
		for (int i = a; a <= b; a++) {
			sum += a;
		} 
		System.out.println("합은: " + sum);
	}
}