package Basic;

import java.io.File;

public class FileDemo1 {

	public static void main(String[] args) {
		
		File f= new File("Cricket123");
		System.out.println(f.exists());  //false 
		f.mkdir(); //create folder i.e dir
		System.out.println(f.exists());  //true file dir exists
	}

}
