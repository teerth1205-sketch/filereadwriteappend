package fileReadWriteAppend;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	  
	public void write(String input, String writeString) {
		try {
		      FileWriter myWriter = new FileWriter(input);
		      myWriter.write(writeString);
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}

}