// (1) (2) (3) (4) (5)
// (5) (4) (3) (2) (1)
// (1) (2) (3) (4) (5)
// (5) (4) (3) (2) (1)
// (1) (2) (3) (4) (5)

public class Loop2D3 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				for (int j = 1; j <= 5; j++) {
					System.out.print("(" + j + ")");
				}
				System.out.println();
			} else {
				for (int j = 5; j >= 1; j--) {
					System.out.print("(" + j + ")");
				}
				System.out.println();
			}
		}
		
		
	    
		// for (int i = 1; i <=5; i++) {
			// System.out.printf("(%d) ", i);
		// }  System.out.println();
		// for (int j = 5; j >= 1; j--) {
			// System.out.printf("(%d) ", j);
		// }
		
	}		
}