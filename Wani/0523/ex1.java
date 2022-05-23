// 2의 제곱 수를 32개 나열하고 결과값을 확인해보세요
// 2 4 8 16 32 64 128 256 512 ...

public class ex1 {
	public static void main(String[] args) {
		
		for (long i = 2; i <= (i*32); i*=2) {
			System.out.println(i);
		}
		
	}
}