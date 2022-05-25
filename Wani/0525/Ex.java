//주민번호를 입력하면
//성별을 출력하는 프로그램
// 예 xxxxxx-1xxxxxx
import java.util.Scanner;

public class Ex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int gender;
		String age;
		// String gender = '-';
		// if(gender.charAt(age) != '-')
		
		System.out.print("주민등록번호를 입력하세요: ");
		age = scan.nextLine();
		
	    if (age.charAt(7) == '1' || age.charAt(7) == '3') {
			gender = 1;
		} else if (age.charAt(7) == '2' || age.charAt(7) == '4') {
			gender = 2;
		} else {
			gender = 3;
		}
		
		
		switch (gender) {
			case 1: 
			    System.out.println("남자입니다.");
				break;
			case 2: 
			    System.out.println("여자입니다.");
				break;
				default: 
				System.out.println("잘못된 입력입니다.");
		}
		
	}
}