// 구 부피 구하기
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("반지름이 얼마입니까? ");
		double radius = input.nextDouble();
		double area = (4 * radius * radius * radius) / 3;
		
		System.out.println("구의 부피는: " + area);
	}
}