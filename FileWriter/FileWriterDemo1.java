package FileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {
	
		public static void main(String[] args)throws IOException 
		{
			FileWriter fw=new FileWriter("cricket.txt",true);
			
			
			fw.write(98);//adding a single character 'B'
			fw.write("haskar\nsoftware solutions");  // 
			fw.write("\n"); //new line
			char[] ch={'a','b','c'}; //char array
			fw.write(ch);  //write char
			fw.write("\n");
			fw.flush();
			fw.close();
			
			System.out.println("success");
		}

//	}

}
