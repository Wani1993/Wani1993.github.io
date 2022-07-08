import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Exam extends JFrame{
	
	
	
	public Exam() {
		super("메모장");
		
		JFileChooser chooser = new JFileChooser();
		
		
		JPanel mainPnl = new JPanel();
		mainPnl.setBackground(Color.pink);
		JButton btn1 = new JButton("열기");
		btn1.setFont(new Font("한컴 고딕", Font.BOLD, 16));
		btn1.setBounds(78, 10, 80, 30);
		btn1.setBackground(Color.white);
	
			
		JButton btn2 = new JButton("저장");
		btn2.setFont(new Font("한컴 고딕", Font.BOLD, 16));
		btn2.setBounds(225, 10, 80, 30);
		btn2.setBackground(Color.white);
		
		JTextArea txt = new JTextArea(20, 20);
		txt.setBounds(12, 50, 360, 301);
		txt.setFont(new Font("한컴 고딕", Font.PLAIN, 20));
				
	btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
//				chooser.showOpenDialog(null);
				int result = chooser.showOpenDialog(null);
				if(result == JFileChooser.APPROVE_OPTION) {
					System.out.println("열기 버튼 눌렀을때");
					File file = chooser.getSelectedFile();
//					File fll = new File(file.getAbsolutePath());
					
					BufferedReader br = null;
					
					try {
						br = new BufferedReader(new FileReader(file));
						
						String line;
						String str = "";
						while( (line = br.readLine()) != null) {
							str += line;
							str += "\n";
						}
						txt.setText(str);
						
					} catch (FileNotFoundException ee) {
						ee.printStackTrace();
					} catch (IOException ee) {
						ee.printStackTrace();
					} finally {
						if (br != null) {
							try {
								br.close();
							} catch (IOException ee) {
								ee.printStackTrace();
							}
						}
					}
					
					
					
				//	System.out.println("사용자가 선택한 파일: " + file.getAbsolutePath());
				}
			}
			
		});
		
	
	btn2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {

//			chooser.showSaveDialog(null);
			int result = chooser.showSaveDialog(null);
			if(result == JFileChooser.APPROVE_OPTION) {
				System.out.println("저장 버튼 눌렀을때");
				File file = chooser.getSelectedFile();
//				File fll = new File(file.getAbsolutePath());
												
				PrintWriter pw = null;
				
				try {
					pw = new PrintWriter(new FileWriter(file));  // 포장해주는 객체 PrintWriter
					
					pw.println(txt.getText());
					txt.setText("");
					
				} catch (IOException ee) {
					ee.printStackTrace();
				} finally {
					if(pw != null) {
						pw.close();
					}
				}
			}
		}
	});
	
		getContentPane().add(mainPnl);
		mainPnl.setLayout(null);
		mainPnl.add(btn1);
		mainPnl.add(btn2);
		mainPnl.add(txt);
		
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args) {
		new Exam().setVisible(true);
	}

}
