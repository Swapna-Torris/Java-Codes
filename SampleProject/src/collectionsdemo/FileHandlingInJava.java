package collectionsdemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingInJava {
	Scanner sc = new Scanner(System.in);
	public void CreateFile() {
		try {
			//Creating an Object of a file
			File fileObj = new File("newtest.txt");
			if(fileObj.createNewFile()) {
				System.out.println("File Created = " + fileObj.getName());
			}else {
				System.out.println("File already exists");
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
	
	//to read the file data or information
	public void readAboutFile() {
		File fileObj = new File("test.txt");
		if(fileObj.exists()) {
			System.out.println("File Name = " + fileObj.getName());
			System.out.println("Absolute Path = " + fileObj.getAbsolutePath());
			System.out.println("Writeable = " + fileObj.canWrite());
			System.out.println("Readable = " +fileObj.canRead());
			System.out.println("file size in bytes = " + fileObj.length());
			}else {
				System.out.println("The file does not exist");
			}
	}
	
	//write to a file
	public void writeFile() {
		try {
		FileWriter fwriter = new FileWriter("newtest.txt");
		System.out.println("Enter the data to write in to the file");
		String data = sc.nextLine();
		fwriter.write(data);
		fwriter.close();
		System.out.println("Successfully wrote in to the file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("An exception occured");
			e.printStackTrace();
		}
		
	}

	
	//read data from the file
	public void readDataFromFile() {
		try {
			File myFile = new File("newtest.txt");
			Scanner fileReader = new Scanner(myFile);
			while(fileReader.hasNextLine()) {
				String fileData = fileReader.nextLine();
				System.out.println(fileData);
			}
			fileReader.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	//create a directory
	public void createDir() {
		try {
			
			File  myfile = new File("file");
			if(myfile.mkdir()) {
				System.out.println("Directory created");
			}else {
				System.out.println("Not created");
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
