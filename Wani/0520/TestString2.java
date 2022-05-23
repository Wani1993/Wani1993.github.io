public class TestString2 {
	public static void main(String[] args) {
		String hello = "Hello";
		
		char h = hello.charAt(0); // .charAt(); 는 괄호 안에 들어가는 숫자에 해당하는 글자를 알려준다. (글자는 0번째부터 시작함.)
		System.out.println(h);
		// System.out.println(hello.charAt(-1)); 음수는 적용이 안된다. 
		System.out.println(hello.charAt(1));
		System.out.println(hello.charAt(2));
		System.out.println(hello.charAt(3));
		System.out.println(hello.charAt(4));
		
		int length = hello.length();
		System.out.println(length);  // 문자열의 갯수를 알려준다.
	}
}