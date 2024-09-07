package tom;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class temp {

	public static void main(String args[]){
		
	
		String filename="/home/local/NEXTEDUCATION/subbarajum/workspace/java/src/tom/6553.properties";
		String linetoremove="group_name6553";
		String group_name6553="group_name6553"+"/div";
		String linetoadd=group_name6553;
		try {
			replace(filename, linetoremove, linetoadd);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
	}///home/local/NEXTEDUCATION/subbarajum/workspace/java/src/tom/6553.properties
	
	  public static void replace(String Filename,String linetoremove,String linetoadd) throws Throwable{
  	    
//	        String file="D:\\or.properties";
//	        String lineToRemove="janardhan";
	           String file=Filename;
	           String lineToRemove=linetoremove;
	        try {

	              File inFile = new File(file);

	              if (!inFile.isFile()) {
	                System.out.println("Parameter is not an existing file");
	                return;
	              }

	              //Construct the new file that will later be renamed to the original filename.
	              File tempFile = new File(inFile.getAbsolutePath() + ".tmp");

	              BufferedReader br = new BufferedReader(new FileReader(file));
	              PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

	              String line = null;

	              //Read from the original file and write to the new
	              //unless content matches data to be removed.
	              while ((line = br.readLine()) != null) {

	                if (!line.trim().contains(lineToRemove)) {
                      System.out.println("buywdvwud");
	                  pw.println(line);
	                  pw.flush();
	                }
	              }
	              pw.close();
	              br.close();

	              //Delete the original file
	              if (!inFile.delete()) {
	                System.out.println("Could not delete file");
	                return;
	              }

	              //Rename the new file to the filename the original file had.
	              if (!tempFile.renameTo(inFile))
	                System.out.println("Could not rename file");

	            }
	            catch (FileNotFoundException ex) {
	              ex.printStackTrace();
	            }
	            catch (IOException ex) {
	              ex.printStackTrace();
	            }
	           
	       //writing file
	        
	        /*try {
	            Files.write(Paths.get(file), linetoadd.getBytes(), StandardOpenOption.APPEND);
	        }catch (IOException e) {
	            //exception handling left as an exercise for the reader
	        }*/
	        
	        
	        FileWriter fw = new FileWriter(file, true);
          BufferedWriter bw = new BufferedWriter(fw);
          PrintWriter out = new PrintWriter(bw);

          out.println(linetoadd);
          
          out.close();

//	       try(FileWriter fw = new FileWriter(file, true);
//	            BufferedWriter bw = new BufferedWriter(fw);
//	            PrintWriter out = new PrintWriter(bw))
//	        {
//	            out.println(linetoadd);
//          //more code
//      } catch (IOException e) {
////	            //exception handling left as an exercise for the reader
//	        }
	      }
}
