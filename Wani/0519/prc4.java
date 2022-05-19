// 사용자가 3대 측정
// 벤치, 스쿼트, 데드
// 합이 500이상이면 true
// 그렇지 않으면 false
import java.util.Scanner;

public class prc4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("3대 측정하겠습니다.");
		System.out.print("벤치: ");
		int bench = input.nextInt();
		System.out.print("스쿼트: ");
		int squat = input.nextInt();
		System.out.print("데드: ");
		int dead = input.nextInt();
		
		int sum = bench + squat + dead;
		System.out.println("총합은: "+ sum);
		
		boolean result = (sum >= 500); // 부등호는 등호 앞으로 와야한다.(아니면 컴파일 에러남.)
		System.out.print("언더아머 가능? " + result);
    }
}