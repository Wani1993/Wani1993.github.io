import java.util.Scanner;

public class Pow {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x;
		System.out.print("정수를 입력하세요.");
	    x = input.nextInt();
		System.out.println("제곱값은" + (x * x));
	}
}