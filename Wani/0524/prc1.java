// Fibonacci 수열
// 1 1 2 3 5 8 13 21 34 ...
// 100이하

public class prc4 {
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		int c;
		
		System.out.print(a + " ");
		System.out.print(b + " ");
		for (int i = 1; i < 10; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}
}