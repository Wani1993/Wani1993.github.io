import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main3 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			File file = new File("d:\\filetest\\practice.txt");
			int length = (int) file.length();
			byte[] buf = new byte[length];  // 바이트의 길이를 알려줘서 그만큼의 배열을 생성한다
			
			
			fis = new FileInputStream(file);
			fis.read(buf, 0, 4); // read 파라미터 안에는 배열이 들어가야한다. 또한 그 배열의 인덱스 번호를 내가 설정한만큼만 볼수있게도 할수있다.
			
			String result = new String(buf);
			
			System.out.println(result);
						
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
