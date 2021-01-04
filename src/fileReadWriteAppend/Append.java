package fileReadWriteAppend;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Append {
	public void append(String fileName, String whatToAppend) throws FileNotFoundException, IOException {
		
	 try (var fos = new FileOutputStream(fileName, true)) {
         fos.write(whatToAppend.getBytes());
         System.out.println("Successfully wrote to the file.");
     }
}
}