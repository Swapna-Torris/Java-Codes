package firstjavaprogram;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResourcesUsingJava9 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("file.txt");
		try{
			String data = "hello from java program";
			byte b[] = data.getBytes();
			fos.write(b);
			System.out.println("Copied data in to the file");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
