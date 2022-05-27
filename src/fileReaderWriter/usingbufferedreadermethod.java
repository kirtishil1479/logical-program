package fileReaderWriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class usingbufferedreadermethod {
	
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("C:\\\\Users\\\\vk\\\\Desktop\\\\New folder\\\\k\\file.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String s;
		
		while((s=br.readLine())!=null)
		{
			System.out.println(s=br.readLine());
		
		}
	}

}
