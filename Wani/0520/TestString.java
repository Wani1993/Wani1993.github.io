public class TestString {
	public static void main(String[] args) {
		String str;       // 참조형은 첫글자가 대문자 (클래스를 불러오기 때문)
		str = "Hello World";
		
		System.out.println(str);
		
		String s2 = "다음 문자열";    // 초기화 되지않으면 컴파일 에러가 발생한다.
		System.out.println(s2);
		
		
		// String 타입에서는 숫자를 넣든 불린값을 넣든 문자열로 인식하기때문에 그대로 출력됨 
		//(단, 괄호안에 들어간 숫자들은 연산이 끝난뒤에 문자열로 붙는다.)
		String concat = str + 1 + 2 + "\n" + true + s2;   
		System.out.println(concat);
	}
}