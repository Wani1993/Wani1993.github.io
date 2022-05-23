public class StringEquals {
	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hello";
		String llo = "llo";
		
		System.out.println(a == b);  
		
		System.out.println(a == ("He" + llo));  // 문자로 봤을때는 같은 Hello이지만 서로 다를 객체라 판단해 false가 나옴
		
		System.out.println("-------문자열 값 동등 확인 -------");
		System.out.println(a.equals("He" + llo));  // 값이 같을때만 true로 알려준다. (문자열 비교할때는 equals)
	}
}