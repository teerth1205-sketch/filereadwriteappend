package fileReadWriteAppend;
import java.io.File;  
import java.io.IOException;  

public class ReadWriteAppend {
	public void create(String input) {
		try {
	    	File myObj = new File("/Users/teerthpatel/eclipse-workspace/" + input);

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

	
	
		  

	
	
	
