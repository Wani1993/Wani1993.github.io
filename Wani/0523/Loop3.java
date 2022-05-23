public class Loop3 {
	public static void main(String[] args) {
		// 0부터 100사이의 수 중 3의 배수 또는 7의 배수를 출력해보세요.
		// 0 3 6 7 9 12 14 15 . . .
		
		int a = 0;
		while(a <= 100) {
			if (a % 3 == 0 || a % 7 == 0) {
				System.out.println(a);
			}
			a++;
		}
		
		// 0부터 100사이의 수 중 일의 자리 수가 3, 6, 9 일때만 출력.
		// 3 6 9 13 16 19 23 . . .
		
		int b = 0;
		while(b <= 100) {
			if (b % 10 == 3 || b % 10 == 6 || b % 10 == 9) {
				System.out.println(b);
			}
			b++;
		}
    }
}