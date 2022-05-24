// 자판기 프로그램
// 돈 입력
// 반복하여 입력받아
// 1번 콜라 : 1500
// 2번 사이다 : 1300
// 3번 계산
// 총 몇 개의 캔을 구입하고, 거스름돈은 얼마인지 출력하세요.

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("돈을 넣으세요: ");
		int money = scan.nextInt();
		
		boolean con = true;
		int coke = 0;
		int soda = 0;
		
		while (con) { 
			System.out.println("1번 콜라 2번 사이다 3번 계산.");
			int what = scan.nextInt();
			
			if (what == 1) {
				money -= 1500;
				System.out.println("콜라를 선택하였습니다.");
				coke++;
			} else if (what == 2) {
				money -= 1300;
				System.out.println("사이다를 선택하였습니다.");
				soda++;
			} else if (what == 3) {
				System.out.println("계산");
				con = false;
				
			} else {
				System.out.println("잘못된 선택입니다.");
			}
			System.out.println("콜라는 " + coke + "사이다는 " + soda + "개 구매하였고, 잔돈은 " + money + "입니다.");
		}
		
	}
} 