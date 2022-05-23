public class StringMethods {
	public static void main(String[] args) {
		String hello = "hello";
		
		int index = hello.indexOf("o");  // 문자를 통해 해당하는 부분의 인덱스 번호를 알려준다.
		System.out.println(index);
		
		int notFound = hello.indexOf("a");  // 찾는 문자가 없을 경우 -1 로 표시를 해준다.
		System.out.println(notFound);
    
        int index2 = hello.indexOf("ll");  // 붙어있는 문자일 경우 시작하는 문자의 숫자를 알려준다.
        System.out.println(index2);		
		
		int index3 = hello.lastIndexOf("l");  // 뒤에서부터 해당 문자를 찾기 시작한다. (lastIndexOf)
		System.out.println(index3);
	}
}