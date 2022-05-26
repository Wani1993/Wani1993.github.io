import java.util.Scanner;
public class TestMethod4 {
	// 정수 하나를 전달 받아 1~ 100 사이의 수이면 true를 반환하고, 그렇지 않으면 false를 반환하는 메소드 작성.
	
	public static boolean isMethod(int number) {
		if (number >= 1 && number <= 100) {
			return  true;
		} else {
			return  false;
		}
	}
	
	// 사용자가 국어, 영어, 수학 점수를 입력하는데 (사용자 입력값은 1 ~ 100 사이여야함.)
	// 입력한 점수와, 점수 합을 출력해보세요.
	
	public static int sumGrade(int a, int b, int c) {
			return a + b + c;
		}
	
	
	public static void main(String[] args) {
		// System.out.println(isMethod(150));
		// System.out.println(isMethod(150));
	    Scanner scan = new Scanner(System.in);
		int kor;
		int eng;
		int math;
	
	    do {
			System.out.println("국어점수: ");  // 국어점수 입력받기
			kor = scan.nextInt();          // 국어점수 확인하기
		} while (!(kor >= 1 && kor <= 100));    // 1.범위가 맞으면 다음 2.틀리면 다시 입력.
		
        do {		
			System.out.println("영어점수: ");
			eng = scan.nextInt();
		} while (!isMethod(eng));
		
		do {
			System.out.println("수학점수: ");
			math = scan.nextInt();
	    } while (!isMethod(math));
		
		int sum = sumGrade(kor, eng, math);
		
		System.out.printf("국어: %d, 영어: %d, 수학: %d, 총합은: %d\n", kor, eng, math, sum);
	
		
	}
}