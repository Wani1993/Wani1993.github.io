//3. 전달받은 두 문자열의 길이 값의 합을 반환하는 메소드.
import java.util.Scanner;
public class prc3 {
	public static String leng(String a, String b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자를 입력하시오: ");
		String a = scan.nextLine();
		System.out.print("문자를 입력하시오: ");
		String b = scan.nextLine();
		
		int last = leng(a, b).length();
		
		System.out.println("문자열의 길이는" + last);
	}
}