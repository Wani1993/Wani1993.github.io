import java.io.File;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) {
		File file = new File(".\\");  // ★   . 하나는 현재 경로를 의미한다. (상대적 경로)
		
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.exists());
		
		System.out.println(file.getAbsolutePath());
		try {
			System.out.println(file.getCanonicalPath());  // 이 메소드는 예외를 발생 시키기 때문에 무조건 예외 처리를 해야한다.
		} catch (IOException e) { 
			e.printStackTrace();
		}
		
		
		File fileParent = new File("..\\");
		
		System.out.println(fileParent.getAbsolutePath());
		try {
			System.out.println(fileParent.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try  {
			File file3 = file.getCanonicalFile().getParentFile();
			System.out.println(file3.getAbsolutePath());
			System.out.println(file3.getCanonicalPath());
			System.out.println(fileParent.equals(file3));
			
			System.out.println(fileParent.compareTo(file3)); // 참조값을 같게만든다
			System.out.println(fileParent.getCanonicalFile().equals(file3));
			System.out.println(fileParent.getCanonicalFile().compareTo(file3)); 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
