import java.io.*;  
import java.util.*;
public class MemoryFileParsing
 {  
    public static void main(String args[])throws Exception{    
          
    File f1=new File("C:\\Cogni\\Memory.txt"); 
      int lines=0;           
      FileReader fr=new FileReader(f1);  
      BufferedReader br = new BufferedReader(fr);
      String s;              
      while((s=br.readLine())!=null)    
      {
         lines++;             
            
      }
      fr.close();

   String text = "";


FileReader f2=new FileReader("C:\\Cogni\\Memory.txt"); 

BufferedReader re = new BufferedReader(f2);
 
for(int i=1; i<=lines; i++)
    {
	if(i%2==0)
          text+=re.readLine()+ "\n";
	else
 	 re.readLine();

     }
	
	re.close();
    System.out.println(text);
    }    
}    