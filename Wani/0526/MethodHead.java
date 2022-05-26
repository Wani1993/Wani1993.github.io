public class MethodHead {
	// 정수 두 개를 전달 받아 왼쪽이 큰지 오른쪽이 큰지 혹은 같은지 알고싶음.
	
	public static int compare(int left, int right) {
		return left - right; // -1, 0, 1
	}
	
	public static char compare2(int left, int right) {
		if (left > right) {
			return 'L';
		} else if (left < right) {
			return 'R';
		} else {
			return 'S';
		}
	}
	
	public static void main(String[] args) {
		char result = compare2(150, 170);
		System.out.println(result);
	}
}