// 저금통
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("저금통에 얼마나있는가?");
		System.out.print("500원짜리: ");
		int muney = input.nextInt();
		System.out.print("100원짜리: ");
		int mune = input.nextInt();
		System.out.print("50원짜리: ");
		int mun = input.nextInt();
		System.out.print("10원짜리: ");
		int mu = input.nextInt();
		
		int total = muney * 500 + mune * 100 + mun * 50 + mu * 10;
		
		System.out.print("총 금액: " + total);
	}
}