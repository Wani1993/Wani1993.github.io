// 컵 사이즈 알려주기
// 사용자의 정수를 입력받아서
// 200이상이면 large
// 100이상 ~ 200미만 medium
// 100미만 small
import java.util.Scanner;

public class TestElseIf {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("컵사이즈: ");
		int cup = input.nextInt();
		
		String size;
		if (cup >= 200) {
			size = "large";
		} else if (cup >= 100) {
			size = "medium";
		} else {
			size = "small";
		}
		
		System.out.println(size);
		
	}
}