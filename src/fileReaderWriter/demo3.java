package fileReaderWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class demo3 {

	public static void main(String[] args) throws FileNotFoundException {
		 
		File f=new File("C:\\Users\\vk\\Desktop\\New folder\\k\\file.txt");
		Scanner sc=new Scanner(f);
		sc.useDelimiter("\\z");
		System.out.println(sc.next());

	}

}
