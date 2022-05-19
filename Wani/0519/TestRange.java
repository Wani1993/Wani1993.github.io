public class TestRange {
	public static void main(String[] args) {
		// 0 ~ 100 사이??
		// 숫자가 0이상'이고' 100이하 인가?
		int number = 99;
		// java 언어는 한번에 하나씩밖에 못물어봄
		System.out.println(0 <= number && number <= 100);
		// System.out.println(0 <= number);
		// System.out.println(number <= 100);
	}
}