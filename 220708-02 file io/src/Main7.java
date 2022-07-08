import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main7 {
	public static void main(String[] args) {
		Map<Integer, Set<Integer>> lotto = new LinkedHashMap<>();
		
		lotto.put(1000, new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)));
		lotto.put(1001, new HashSet<Integer>(Arrays.asList(7, 8, 9, 10, 11, 12)));
		lotto.put(1002, new HashSet<Integer>(Arrays.asList(13, 14, 15, 16, 17, 18)));
		
		// lotto.txt 출력
		// 1000 : [1, 2, 3, 4, 5, 6]
		// 1001 : [7, 8, 9, 10, 11, 12]
		// 1002 : [13, 14, 15, 16, 17, 18]
		
		
//		System.out.println(1000 + " = " + lotto.get(1000));
//		System.out.println(1001 + " = " + lotto.get(1001));
//		System.out.println(1002 + " = " + lotto.get(1002));
		
		Set<Integer> keySet = lotto.keySet();   // keySet()을 이용해서 모든 키들을 불러올수있다.
		for(Integer key : keySet) {     		// 포이치문을 이용한 모든 키값과 벨류값을 출력해준다.
			System.out.println(key + " : " + lotto.get(key));
		}
		
		
		File file = new File("d:\\filetest\\lotto.txt");
		
		PrintWriter pr = null;
		
		try {
			pr = new PrintWriter(file);
			
			pr.println(1000 + " = " + lotto.get(1000) + "힛");
			pr.println(1001 + " = " + lotto.get(1001) + "힛");
			pr.println(1002 + " = " + lotto.get(1002) + "힛");
			
			for(Integer key : lotto.keySet()) {
				pr.println(key + " = " + lotto.get(key));
			}
			
			pr.flush();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(pr != null) {
				pr.close();
			}
		}
		
//		BufferedReader br = null;
//		
//		try {
//			br = new BufferedReader(new FileReader(file));
//				
//			String line;
//			while ((line = br.readLine()) != null) {
//				System.out.println(line);
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			if(br != null) {
//				try {
//					br.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//		
		
	}
}
