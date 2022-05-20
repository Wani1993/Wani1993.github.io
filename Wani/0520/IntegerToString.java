public class IntegerToString {
	public static void main(String[] args) {
		String strNum = String.valueOf(12345);  // String strNum = "" + 12345; 와 똑같은 말
		System.out.println(strNum);
		
		int i = 5055;
		String strNum2 = "" + i;  
		
		// System.out.println(i + 100);  i가 정수라서 정수의 합을 출력
		// System.out.println(strNum2 + 100);  strNum2가 문자열이기때문에 옆으로 문자열로 출력
		
		System.out.println(strNum2.charAt(3));
	}
}