package fileReaderWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class usingScannerAndFile {

	public static void main(String[] args) throws FileNotFoundException {
	     
		   File f=new File("C:\\Users\\vk\\Desktop\\New folder\\k\\file.txt");
		   
		   Scanner sc=new Scanner(f);
		   while(sc.hasNextLine())
		   {
			   System.out.println(sc.nextLine());
		   }
		   

	}

}
