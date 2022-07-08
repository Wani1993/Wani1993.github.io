import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Main6 {
	public static void main(String[] args) {
		// 파일 생성 (직접)
		// persons.txt
		// 파일 정보를 한 줄씩 읽어서
		// 1. 콘솔 출력
		// 2. 사람 평균 나이 구해서 출력
		
		File file = new File("d:\\filetest\\persons.txt");
		
		PrintWriter pr = null;
		
		try {
			pr = new PrintWriter(new FileWriter(file));
			
			pr.println("홍길동,22");
			pr.println("둘리,33");
			pr.println("도우너,44");
			
			pr.flush();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(pr != null) {
				pr.close();
			}
		}
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			
			int sum = 0;
			int count = 0;
			
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				
				int index = line.indexOf(','); // ,의 인덱스 값을 알아내는것
				String strAge = line.substring(index + 1);  // substring은 인덱스번호 포함한 그 뒤에 문자들을 잘라줌 (쉼표 뒤에 문자니까 인덱스 + 1)
				Integer age = Integer.valueOf(strAge); // 문자열이니까 인트형으로 변환
				
				System.out.println("숫자 변환 결과" + age);
				sum += age;
				count++;
			}
			System.out.println("평균나이: " + sum / count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}
}
