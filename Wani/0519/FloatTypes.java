public class FloatTypes {
	public static void main(String[] args) {
		float f = 123.456F;
		double d = 7777.8888;
		
		// double sum = f + d;
		
		int i = 10000;
		float sum = i + f;
		
		float one = 0.1F;
		System.out.printf("%.15f\n", one * 22);  // %f 사이에 .15 는 소숫점 15번째 자리까지 표현한다는 뜻
		System.out.printf("%04d", 10);
	}
}