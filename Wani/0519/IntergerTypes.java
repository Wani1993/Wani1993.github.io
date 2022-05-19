public class IntergerTypes {
	public static void main(String[] args) {
		byte b = 100;
		short s = 30000;
		int i = 10_000_000; // 쉼표로 자릿수를 설정하면 컴파일 오류가 남.
		long l = 123456789L;
		
		long sum = 100 + 100L;
		System.out.println(sum);
		
		// byte b2 = 100;
		
		// byte sum = b + b2;
		// System.out.println(sum); 바이트에 들어가는 숫자보다 큰 숫자가 들어가면 컴파일 오류가 남.
	}
}