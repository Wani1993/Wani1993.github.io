//2. 전달받은 정수만큼 "안녕" 이라는 문자열을 출력하는 메소드. (반환값이 없음, return type : void)

public class prc2 {
	public static void hi(int num) {
		for (int i = 0; i < num; i++)
		System.out.println("안녕");
	}
	
	
	public static void main(String[] args) {
		hi(4);
	}
}