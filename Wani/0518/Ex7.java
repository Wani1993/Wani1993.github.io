// 사용자에게 이름과 나이를 물어보고 출력하는 프로그램
import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("이름이 무엇입니까? ");
		String name = input.nextLine();
		System.out.print("나이는 몇살입니까? ");
		int age = input.nextInt();
		System.out.println("이름은 " + name + "이고 나이는" + age + "세 입니다.");
		
		
	}
}