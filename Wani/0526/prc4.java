// 4.키(실수,미터단위)와 몸무게(실수,kg단위)를 전달받아
// 한국기준 BMI 지수(실수) 구해 반환하는 메소드.
// BMI = (몸무게) / (키)*(키)
import java.util.Scanner;
public class prc4 {
	public static double bmi(double a, double b) {
		Scanner scan = new Scanner(System.in);
		//키와 몸무게 전달받기
		System.out.print("키: ");
		a = scan.nextDouble();
		System.out.print("몸무게: ");
		b = scan.nextDouble();
		// BMI 구하기
	    return b / (a * a);
	}
	
	public static void main(String[] args) {
		double a = 0;
		double b = 0;
		// 최종 BMI = ?
		System.out.println("BMI : " + bmi(a, b));
	}
}