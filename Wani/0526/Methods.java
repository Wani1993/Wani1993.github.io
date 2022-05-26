public class Methods {
	// 숫자 하나가 짝수, 홀수 인지 알고싶음. 이 기능을 할 수 있는 메소드.
	// 리턴타입 이름(정수)
	public static boolean isEven(int number) {
		return number % 2 == 0;
	}
	
	public static int isEven(int a, int b, int c) {
		return a + b + c;
	}
	
	public static char isEven(int) {
		
	}
	
	public static void isEven(int num) {
		return;
	}
	
	
	
	public static int increase(int a) {
		a++;
		return a;  // 리턴 값을 안넣어주면 a++ 가 적용이 안된다
	}
	
	// public static int ,int createTwoNumber() {
		// return 20, 30;
	// }

    // public static boolean test() {
		// return 10%
	// }    
	
	public static void main(String[] args) {
		int a = 10;
		a = increase(a); // call By Value
		
		System.out.println(a);
	}
}