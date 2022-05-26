// 4.키(실수,미터단위)와 몸무게(실수,kg단위)를 전달받아
// 한국기준 BMI 지수(실수) 구해 반환하는 메소드.
// BMI = (몸무게) / (키)*(키)
import java.util.Scanner;
public class prc4simple {
	public static double bmi(double a, double b) {
	
		// BMI 구하기
	    return b / (a * a);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//키와 몸무게 전달받기
		System.out.print("키: ");
		double a = scan.nextDouble();
		System.out.print("몸무게: ");
		double b = scan.nextDouble();
		double bmi = bmi(a, b);
		// 최종 BMI = ?
		System.out.println("BMI : " + bmi);
	}
}