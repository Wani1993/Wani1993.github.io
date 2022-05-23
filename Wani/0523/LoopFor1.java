public class LoopFor1 {
	public static void main(String[] args) {
		// "반복"이라는 문자열 5번 출력하기
		// for (int i = 0; i < 5; i++) {       // for는  괄호안에서 제일 앞부분으로 온다. 두번째부분에서는 true 아님 false 값중에 하나만 나온다.
			// System.out.println("출력");      // true 일때는 중괄호 안으로 들어가서 실행한다. 중괄호가 끝나면 제일 마지막부분으로가서 i++을 실행한다.
		// }                                  // 그 다음에 다시 두번째 부분으로 가서 참인지 거짓인지 판별 뒤에 false 가 되는순간까지 반복한다. (한부분이 비워져있어도 동작을 한다.)
		
		// System.out.println(i);  // for문이 끝나고나면 안에있는 i값은 사라진다. (지역변수이기 때문에.)
		
		
		// 1부터 10까지 출력하기 (for)
		// for (int i = 1; i <= 10; i++) {
			// System.out.println(i);
		// }
		
		// 21부터 30까지의 3의 배수 출력하기
		// for (int i = 21; i <= 30; i+=3) {
			// System.out.println(i);
		// }
		
		// 30 29 28 27...20까지 역순 출력하기
		for (int i = 30; i >= 20; i-=1) {
			System.out.println(i);
		}
		
	}
}

