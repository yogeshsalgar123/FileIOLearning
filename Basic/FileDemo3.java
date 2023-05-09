//Write code to create a directory named with bhaskar123 in current working directory and 
//create a file named with abc.txt in that directory.

package Basic;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {

	public static void main(String[] args) throws IOException {
		File f1= new File("Bhaskar123");
		f1.mkdir();
		System.out.println("directory created");
		
		File f2 = new File("bhaskar123","abc.txt");
		System.out.println(f2.exists()); //false bcoz abc.txt not exist
		f2.createNewFile();  //bhaskar123\abc.txt
		System.out.println("file "+f2+" created successfully");
		
		
		
	}

}
