public class TypeConversion {
	public static void main(String[] args) {
		int i;
		double f;
		
		f = 5 / 4;  // 정수형으로 나누기를 먼저 한 다음 f에 대입연산이 이루어지기 때문에 결과값이 1.0이 된다.
		System.out.println(f);
		
		f = (double) 5 / 4;
		System.out.println(f);
		
		f = 5 / (double) 4 ;
		System.out.println(f);
		
		f = (double) 5 / (double) 4;
		System.out.println(f);
		
		i = (int) 1.3 + (int) 1.8;
		System.out.println(i);
		
		i = (int) (1.3 + 1.8);
		System.out.println(i);
	}
}