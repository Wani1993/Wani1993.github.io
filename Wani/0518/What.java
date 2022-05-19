// 사용자에게 초단위의 시간을 입력받아
// 시간 분 초로 변환을 하는 프로그램

// 입력예) 3666
// 출력예) 1시간 1분 6초
import java.util.Scanner;

public class What {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("초단위 시간변경하기");
		
		System.out.print("몇초인가욥? ");
		int sec = input.nextInt();
		
		int hour = (sec / 3600);
		int min = (sec % 3600 / 60);
		int wow = (sec % 3600 % 60);
		
		
		System.out.println("결과는: " + hour + "시간" + min + "분" + wow + "초" );
		
		
	}
}