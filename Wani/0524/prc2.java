// 사용자에게 비밀번호를 물어보고 동일할 경우 통과
// 최대 3번의 기회를 줌

import java.util.*;

public class prc2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    Random random = new Random();
		int what = random.nextInt(9000) + 1000;
		
		
			for (int i = 1; i <= 3; i++){
				System.out.print("비밀번호를 입력하세요: ");
				int a = scan.nextInt();
				if (a == what) {
					System.out.println("딩동댕");
					
					break;
				} else if (i <= 2) {
					System.out.println("3번틀리면 안열어줌.");
				} else if (i == 3) {
					System.out.println("안열어줌 ㅅㄱ.");
				}
			}
			
	}
}
