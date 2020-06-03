package hack;
import java.io.*;
import java.util.*;
public class Hackathon_battery {
	public static void main(String args[])
	{
		try {
			FileReader fr=null;
			fr=new FileReader("C:\\Users\\hp\\eclipse-workspace\\hack\\src\\Battery.txt");
			BufferedReader br=new BufferedReader(fr);
			String line;
			while((line=br.readLine())!=null)
			{
				StringTokenizer st=new StringTokenizer(line);
				while(st.hasMoreTokens())
				{
					if(st.nextToken().equals("activities:"))
					{
						//st.nextToken();
						int str=st.nextToken().length();
						System.out.println(line.substring(28,line.length()));
						
					}
				}
			}
			
			
			
			
	}catch(FileNotFoundException e)
		{
		e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

}
}