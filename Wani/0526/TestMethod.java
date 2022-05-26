public class TestMethod {
	public static void printRepeat() { // 메소드 머리 (head) - 기능이름
	    // 메소드 몸통(body) - 기능동작
		for (int i = 0; i < 3; i++) {
			System.out.println("반복 중");
		}
	}
	
	// printHello
	public static void printHello() {
		int number = 10;
		System.out.println("Hello");
		System.out.println("초기화한 변수 값: " + number);
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작~");
		
		printHello();
		System.out.println("헬로안에서 초기화한 변수 값: " + number);
		// for (int i = 0; i < 2; i++) {
			// printRepeat();  // 메소드 호출하는 것
		
		
		System.out.println("프로그램 끝~");
	}
    }