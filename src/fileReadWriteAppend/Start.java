package fileReadWriteAppend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Start {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Do you want to read a file write a file or append to a file?");
		String input = scanner.nextLine();
	    //scanner.nextLine();
		
		if (input.equals("write")) {
			System.out.println("Give me a file to write to");
			String fileName = scanner.nextLine();
			System.out.println("Give me something to write to the file");
			String stringTowrite = scanner.nextLine();
			WriteToFile wantToWrite = new WriteToFile();
			wantToWrite.write(fileName, stringTowrite);
			
			
		} else if (input.equals("read")) {
			System.out.println("Give me a file name to read");
			String fileToRead = scanner.nextLine();
			ReadFile readFile = new ReadFile();
			readFile.read(fileToRead);
		} else if (input.equals("create")) {
			System.out.println("Give me a filename to create");
			String fileName = scanner.nextLine();
			ReadWriteAppend wantToCreate = new ReadWriteAppend();
			wantToCreate.create(fileName);
		} else if (input.equals("append")) {
			System.out.println("Give me a file to Append to");
			String fileName = scanner.nextLine();
			System.out.println("Give me something to append to the file");
			String stringTowrite = scanner.nextLine();
			Append wantToAppend = new Append();
			wantToAppend.append(fileName, stringTowrite);
		};
		float numberB = scanner.nextFloat();
		System.out.println("Give me a operation please:");
		scanner.nextLine();
		String operation = scanner.nextLine();
		
		try {
	      File myObj = new File("filename.txt");
	      if (myObj.createNewFile()) {
	        System.out.println("File created: " + myObj.getName());
	      } else {
	        System.out.println("File already exists.");
	      }
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	  }
	

}
