public class LoopBreak {
	public static void main(String[] args) {
		// for (int i = 0; i < 10; i++) {
			// if (i == 5) {
				// break;  // 만나는 순간 반복을 멈춘다.
			// }
			// System.out.println(i);
		// }
		
		for (int i = 10; i < 20; i++) {
			if (i % 10 == 5) {
				continue;  // 현재 단계를 건너 뛰고 진행.
			}
			System.out.println(i);
		}
		
		// int i = 20;
		// while (i < 30) {
			// if (i == 25) {
				// continue;  // 만난는 순간 다시 와일의 조건문으로 검사하러가고 참일경우 if >> continue >> while 순으로 무한반복 된다.
			// }
			// System.out.println(i);
			// i++;
		// }
		
		System.out.println("프로그램 종료");
	}
}