public class OnelineIf {
	public static void main(String[] args) {
		boolean con = false;
		 // 사용해야할 문장이 한문장이라면 중괄호를 생략해도 된다. but 중괄호는 붙이는편이 보기 편하다.
		
		String result = (con) ? "천재이고 싶은 바보" : "그냥 바보";  // ? 삼항연산자라고 불린다. ? 왼쪽에는 boolean값이 나온다.(5>0)같은 수식이 와도된다.
		
		System.out.println(result);
		
		System.out.println("프로그램 종료");
	}
}