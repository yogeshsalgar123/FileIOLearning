package Basic;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		
		File f= new File("abc.txt"); //it creates java file object of name  abc
		System.out.println(f.exists()); //false
		f.createNewFile(); // (exception IO) creates new file in project dir
		System.out.println(f.exists());
		
	}
}
