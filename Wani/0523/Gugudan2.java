import java.util.Scanner;

public class Gugudan2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int a = input.nextInt();
		
		int i = 1;
		while(i <= 9) {
			System.out.printf("%d * %d = %d\n", a, i, a * i);
			i++;
		}
	}
}