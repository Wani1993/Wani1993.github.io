import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		File diaryFile = new File("d:\\filetest\\diary.txt");
//		System.out.println(diaryFile.exists());
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(diaryFile); // 파일을 읽어 들일때 사용해야한다 기존의 System.in 이 아닌 파일 객체를 넣어주면됨
			
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
			
			
			
		} catch (FileNotFoundException e) {  // ioexception을 상속받은것
			System.out.println("파일을 찾지 못했습니다.");
		} finally {
			if(scanner != null) {
				scanner.close();
			}
		}
		
		
	}
}
