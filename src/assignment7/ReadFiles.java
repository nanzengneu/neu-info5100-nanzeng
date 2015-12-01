package assignment7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReadFiles {
	private File file;
	private FileInputStream fis;
	private InputStreamReader isr;
	private BufferedReader br;
	
	public ReadFiles(String str) throws IOException{
		file = new File(str);
		fis = new FileInputStream(file);
		isr = new InputStreamReader(fis);
		br = new BufferedReader(isr);
	}
	
	public ArrayList<String> readLineByLine() throws IOException{
		ArrayList<String> lines = new ArrayList<String>();
		while(true){
			String line = br.readLine();
			if(line == null) {
				return lines;
			}
			lines.add(line);
		}

	}
	
	public void reverseList(ArrayList<String> lines){
		for(int i = lines.size() - 1; i >= 0; i--) {
			System.out.println(lines.get(i));
		}
	}
	
	public static void main(String[] args) throws IOException{
		ReadFiles readFiles = new ReadFiles("/Users/abc/Documents/Java/data.txt");
		readFiles.reverseList(readFiles.readLineByLine());
	
	}

}
