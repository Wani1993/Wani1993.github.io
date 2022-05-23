// 사용자의 학점
// 점수를 입력받아
// 90점 이상 A
// 80점 이상 90점 미만 B
// 70점 이상 80점 미만 C
// 60점 이상 70점 미만 D
// 60점 미만 F
import java.util.Scanner;

public class TestElseIf2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int a = input.nextInt();
		
		String grade;
		if (a >= 90) {
			grade = "A";
		} else if (a >= 80) {
			grade = "B";
		} else if (a >= 70) {
			grade = "C";
		} else if (a >=60 ) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		System.out.println("학점은 " + grade + "입니다.");
	}
}