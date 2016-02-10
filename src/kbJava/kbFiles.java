package kbJava;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class kbFiles {
	public void writeBufferedFile() {
		String filePath = "D:\\TestBufferedFile.txt";
		//String filePath = "/TestBufferedFile.txt";
	    File file = new File(filePath);
	    Writer fileWriter = null;
	    BufferedWriter bufferedWriter = null;
	    
	    List<String> contentList = new ArrayList<String>();
	    for (int i = 0; i <= 1000; i++) {
	    	contentList.add(Integer.toString(i));
	    }
	    String[] content = new String[contentList.size()];
	    contentList.toArray(content);
	    
	    //String[] content = {"aa", "bb"};
	    
	    try {
		    //Use this for append mode
	    	//if(!file.exists()){file.createNewFile();}
	        //fileWriter = new FileWriter(file,true);
	        
	        fileWriter = new FileWriter(file);
	        
	        bufferedWriter = new BufferedWriter(fileWriter);
	        for (String line : content) { //actually we can use arraylist here; directly replace content with contenList
	            line += System.getProperty("line.separator");
	            bufferedWriter.write(line);
	        }
	    } catch (IOException e) {
	        System.err.println("Error writing the file : ");
	        e.printStackTrace();
	    } finally {
	        if (bufferedWriter != null && fileWriter != null) {
	            try {
	                bufferedWriter.close();
	                fileWriter.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}
}
