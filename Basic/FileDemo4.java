
//Write code to create a file named with demo.txt present in c:\xyz folder.

package Basic;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {

	public static void main(String[] args) throws IOException {
		File f= new File("C:\\Users\\DELL\\eclipse-workspace\\FileIoLearning\\xyz");
		f.mkdir();
		System.out.println("dir created in specified path");
		File f1= new File("xyz","demo.txt"); //obj created
		f1.createNewFile(); //file created in dir
		System.out.println("Folder and file is created in xyz folder");
		
		System.out.println(f1.isFile());  //file is present
		
		System.out.println("names of all files present:"+f1.list());
		System.out.println("no.of char present in file:"+f1.length());
		
		File f2 = new File("example.txt");
		f2.createNewFile();
		System.out.println("file "+ f2 +" is created in current dir");
		
		f2.delete();
		System.out.println("file "+f2+" is deleted from current dir");
		
		
		
	}

}
