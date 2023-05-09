
//write a code to create txt file in currentr directoary with name Demo 
package Basic;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		File f = new File("Demo.txt");
		f.createNewFile();
		System.out.println("file created succefully");
	}
}
