public class AutoInc {
	public static void main(String[] args) {
		int a = 10;
		System.out.println(a); // 증감연산자가 앞에 붙어있으면 먼저 연산이됨, 뒤에 붙어있으면 문장을 먼저 출력하고 다음줄로 넘어갈때 연산을 해줌.
       	a++;                   // a++; 명령을 어디에 두느냐에따라 출력되는 문장이 다름. (a자체값을 변경하는것)
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		// 복합 대입 연산자 += -= ...
		// a += 1;  // 11
		// a -= 1;  // 10
		
		// 증감연산자
		// a++;
		// a++;
		// a++;
		
		// a--;
		// System.out.println(a);
	}
}