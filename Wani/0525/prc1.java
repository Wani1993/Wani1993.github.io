// 1.                 
// *						
// **			 		
// ***					
// ****				   
// *****

public class prc1 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
        
		System.out.print("----------------------------------------------------\n");
		
		
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.print("----------------------------------------------------\n");
		

		for (int i = 0; i < 5; i++) {    
			for (int j = 5; j > i; j--) {
				System.out.print("　");
			} for (int j = 0; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
	    System.out.print("----------------------------------------------------\n");
	
	
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print("　");
			} for (int j = 0; j <= i; j++) {
				System.out.print("★");
			} for (int j = 1; j <= i; j++) {
				System.out.print("☆");
			}
			System.out.println();
		}
		
	    System.out.print("----------------------------------------------------\n");		
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("　");
			}
			for (int j = 5; j > i; j--) {
				System.out.print("★");
			} for (int j = 4; j > i; j--) {
				System.out.print("☆");
			}
			System.out.println();
		}		
		
	}
}