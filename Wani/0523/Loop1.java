public class Loop1 {
	public static void main(String[] args) {
		int i = 0;
		while (i < 5) {
			System.out.println("반복됩니다.");
			i++;
		}
		
		// Hello world 10번 출력하기
		
		int j = 0;
		while (j < 10) {
			System.out.println("Hello world");  // false가 되는순간 반복을 멈춘다.(예를들면 10까지면 9까지 출력후 멈춘다.)
			j++;
		}
		
		int k = 1;
		while (k <= 10) {
			System.out.println(k);
		    k++;
		}
		
	}
}