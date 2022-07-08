import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main4 {

	public static void main(String[] args) {
		File file = new File("d:\\filetest\\lineio.txt");
		
		PrintWriter pw = null;
		
		try {
			pw = new PrintWriter(new FileWriter(file));  // 포장해주는 객체 PrintWriter
			
			pw.println("문자열 한줄을 출력합니다.");
			pw.println("이것이 무엇인고?");
			pw.println(10);
			pw.println(15.15);
			pw.flush();  // 이 메소드를 사용함으로써 입력값들이 제대로 들어간다.
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(pw != null) {
				pw.close();
			}
		}
	}
}
