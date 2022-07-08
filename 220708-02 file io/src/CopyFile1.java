import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile1 {
	public static void main(String[] args) throws IOException {
		FileInputStream in = null; // 입력을 담당하고
		FileOutputStream out = null; // 출력을 담당하고

		try {
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");
			int c;

			while ((c = in.read()) != -1) {  //하나의 바이트를 가져와 담아둔다  >> in.read()	
				out.write(c);
			}
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
