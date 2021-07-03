package collectionsdemo;

import java.util.Scanner;

public class MainFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileHandlingInJava fih = new FileHandlingInJava();
		Scanner sc = new Scanner(System.in);
		char ch = 'y';
		while (ch == 'y') {
			System.out.println("Enter the choice");
			System.out.println("1.CreateFile");
			System.out.println("2.About the File");
			System.out.println("3.Write in to the File");
			System.out.println("4.Read Data from the File");
			System.out.println("5.Create Directory");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				fih.CreateFile();
				break;
			case 2:
				fih.readAboutFile();
				break;
			case 3:
				fih.writeFile();
				break;
			case 4:
				fih.readDataFromFile();
				break;
			case 5:
				fih.createDir();
				break;
			default:
				System.exit(0);
			}
			System.out.println("do you want to continue");
			ch = sc.next().trim().charAt(0);
		}

	}

}
