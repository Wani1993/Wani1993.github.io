//주민번호를 입력하면
//성별을 출력하는 프로그램
// 예 xxxxxx-1xxxxxx 답
import java.util.Scanner;

public class Ex답 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("주민등록번호를 입력하세요: ");
		String age = scan.nextLine();
		
		if (age.length() == 14) {
			char c = age.charAt(7);
			switch (c) {
				case '1': case '3':
				System.out.println("남자입니다.");
				break;
				case '2': case '4':
				System.out.println("여자입니다.");
				break;
				default:
				System.out.println("잘못된 입력입니다,");
			}
		} else {
			System.out.println("잘못된 입력입니다,");
		}
		
	}
}