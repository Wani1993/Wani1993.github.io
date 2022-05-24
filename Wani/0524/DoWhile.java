import java.util.Scanner;
public class DoWhile {
	public static void main(String[] args) {
		// do {
			// System.out.println("실행 되나?");
		// } while (false);
		Scanner scan = new Scanner(System.in);
		System.out.println("10을 나눌 수 입력");
		
		int num;
		do {
			num = scan.nextInt();
			if (num == 0) {
				System.out.println("0으로 나눌 수 없음");
			}
		} while (num == 0);  // do while 문에는 마지막에 세미콜론을 붙여준다.
		System.out.println(10 / num);
		
	}
}