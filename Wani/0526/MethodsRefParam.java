public class MethodsRefParam {
	public static String concat(String left, String right) {  // 참조형 변수에서는 참조하는 방향 (화살표)가 복사된다.
		return left + right;
	}
	
	
	public static void main(String[] args) {
		String h = "Hello";
		String w = "World";
		String result = concat(h, w);
		
		System.out.println(result);
	}
}