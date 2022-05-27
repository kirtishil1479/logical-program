package fileReaderWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {

	public static void main(String[] args) throws IOException {
		 FileWriter fw=new FileWriter("C:\\Users\\vk\\Desktop\\New folder\\k\\example.txt");
		 
		 BufferedWriter bw=new BufferedWriter(fw);
		 
		 bw.write("kirtishil ");
		 bw.write("dhiwar");
		 
		 System.out.println("Data successfully inserted in file");

	}

}
