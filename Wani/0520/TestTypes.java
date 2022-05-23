public class TestTypes {
	public static void main(String[] args) {
		char a = (char) 65;
		System.out.println(a);
		
		int num = (int) a;
		System.out.println(num);
		
		
		
		// double d = 123.456;
		// int i = (int) d; // 더블타입이 인트타입으로 변형되면서 소숫점 자리를 뺀 정수만 표현이됨
		// System.out.println(i);
		
		
		// byte b = 10;
		   // byte와 short 는 int형을 따라가려는 성질이있다.
		// short s = 100;
		// int i = (int) 1000L; // 롱 형태의 숫자를 인트형에 넣고싶을때 앞에 괄호로 인트형인것을 명시해준다.
		// long l = 10000;
		
		// int sum = b + s; // 형이 변하고 있다고해서 형변환이라고 한다.
		// System.out.println(sum);
	}
}