public class BlockScope {
	public static void main(String[] args) {
		int a = 10;  // 지역변수
		{
			int b = 20;   // 지역변수
			System.out.println("가능한가?");
			System.out.println(a);
			System.out.println(b);
		}
		// System.out.println(b);  중괄호 밖에있는 변수는 제기능을 하지 못한다. (괄호 안에있을때만 적용된다.)
		{
			{{
				{
					{
						System.out.println("이건?"); // 중괄호 안을 block이라고 하고 범위를 scope라고한다.
						                            // 중괄호가 몇개가 되었건 짝만 맞다면 문제가 될것이 없다.
					}
				}
			}}
		}
	}
}