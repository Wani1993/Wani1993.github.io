// 사용자의 나이와 이름을 입력받아서
// 자기랑 같으면 true 출력하기
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	    System.out.print("나이를 입력하세요: ");
		int age = input.nextInt();
		System.out.print("이름를 입력하세요: ");
		input.nextLine();
		String name = input.nextLine();
		
		System.out.println((age == 18) && name.equals("김동완"));
	}
}