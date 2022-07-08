import java.io.File;
import java.io.IOException;

public class Main4 {
	public static void main(String[] args) {
		// d:\filetest\한글이름.txt
		
//		File fileKor = new File("d:\\filetest\\한글이름.txt");
//		try {
//			System.out.println("생성됨? " + fileKor.createNewFile());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
//		fileKor.renameTo(new File("d:\\filetest\\newname.txt")); // 바꾸고싶은 이름으로 새로운 객체를 생성한다.
		
		File mytext = new File("d:\\filetest\\mytext.txt");
		mytext.delete();
		
		
	}
}
