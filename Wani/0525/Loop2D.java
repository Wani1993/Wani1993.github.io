public class Loop2D {
	public static void main(String[] args) {
		for (int j = 0; j < 5; j++) {  // 중첩된 반복문에서 밖에 있다고해서 아우터 루프
			for (int i = 0; i < 5; i++) {
				System.out.print('왜');   // 중첩된 반복문에서 안에 있다고해서 이너 루프
			}
			System.out.println();
		}
	}
} 