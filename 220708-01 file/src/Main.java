import java.io.File;

public class Main {
	public static void main(String[] args) {
		File file = new File("D:\\Wani\\test.txt");  // 외부 파일과 연결하는 거 (절대적 경로)
		
		System.out.println(file.getName());   // 파일 이름 알아내는거
		System.out.println(file.getPath());   // 파일 경로 알아내는거
		System.out.println(file.exists());    // 파일이 존재하는지 확인하는거  boolean값
		
		File f2 = new File("D:\\Wani\\asdf.txt");  // ★실제 파일이 아니고 외부에 있는 파일을 가르킬수있는 객체!!
		
		System.out.println(f2.getName());   // 파일 이름 알아내는거
		System.out.println(f2.getPath());   // 파일 경로 알아내는거
		System.out.println(f2.exists());    // 파일이 존재하는지 확인하는거  boolean값
		
		File dir = new File("D:\\Wani");  // 디렉토리도 가능하다
		
		System.out.println(dir.getName());
		System.out.println(dir.getPath());
		System.out.println(dir.exists());
		
		System.out.println("파일인가요? " + dir.isFile());
		System.out.println("디렉토리인가요? " + dir.isDirectory());
		
	}
}
