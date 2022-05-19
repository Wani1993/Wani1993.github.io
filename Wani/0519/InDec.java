public class InDec {
	public static void main(String[] args) {
		int a = 55;
		
		a = 78;
		
		// a = a + 5;  밑에있는 문장이랑 같은 문장
		a += 5;
		
		System.out.println(a);
		
		a -= 3;
		a *= 2;
		a /= 4;
		a %= 2;  // 복합연산자를 사용할때는 꼭 = 앞에 연산자가 들어가야한다.
	}
}