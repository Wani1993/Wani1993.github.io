import java.io.File;
import java.io.IOException;

public class Main3 {
	public static void main(String[] args) {
		File file = new File("d:\\filetest");
		
		System.out.println("있냐? " + file.exists());
		System.out.println("폴더냐? " + file.isDirectory());
		System.out.println("파일임? " + file.isFile());
		
		boolean result = file.mkdir();  // mkdir() 로 디렉토리를 생성할수있다
		System.out.println("디렉토리 생성여부: " + result);
		
		// d드라이브에 filetest 폴더(디렉토리)안에 abc 폴더를 생성해보세요
		File abc = new File("d:\\filetest\\abc");
		abc.mkdir();
		
		File file2 = new File("d:\\filetest\\abc\\..\\def");  // ..\\ 점 두개는 상위경로
		file2.mkdir();
		
		try {
		File file3 = file2.getCanonicalFile(); // new File(file2.getCanonicalPath()); 이거랑 같은말이다
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File textFile = new File("d:\\filetest\\mytext.txt");
		try {
			boolean result2 = textFile.createNewFile();
			System.out.println("생성됨? " + result2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
