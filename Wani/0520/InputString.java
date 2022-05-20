import java.util.Scanner;

public class InputString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt(); // 정수를 입력하고 난뒤 엔터가 남아있어서 밑에서 추가입력이안되는데,
		System.out.println("한줄을 입력하세요");
		scan.nextLine();  // 빈칸을 한줄 넣어줌으로써 입력창을 유지시킬수있게된다.
		String line = scan.nextLine();
		
		System.out.println(line);
	}
}