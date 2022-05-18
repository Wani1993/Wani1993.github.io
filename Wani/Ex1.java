// 마일 > 킬로미터
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("마일을 입력하세요: ");
		double mile = input.nextDouble();
		double km = 1.609;
		System.out.print(mile + "마일은: " + (mile * km) + "km");
		
		
	}
}