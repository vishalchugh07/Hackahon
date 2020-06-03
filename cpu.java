package hack;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.text.DecimalFormat;
import org.json.simple.*;
public class Cpu {
public static void main(String args[])
{
	ArrayList<Double> values=new ArrayList<Double>();
	double sum=0;
	double i=1;
	double max=0;
	double avg=0;
	JSONObject obj=new JSONObject();
	JSONObject obj1=new JSONObject();
	try {
		FileReader fr=null;
		fr=new FileReader("C:\\Users\\hp\\eclipse-workspace\\hack\\src\\CPU.txt");
		BufferedReader br=new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null)
		{
			
			line = line.replaceAll("( )+", " ");
			String []str=line.split(" ");
			String x=str[8].toString();
			values.add(Double.parseDouble(x));
			double f=Double.parseDouble(x);
			if(f>max)
			{
				max=f;
			}
			sum+=f;
			i++;
			
		}
		avg=sum/i;
		avg= Math.round(avg* 100.0) / 100.0;
		
		//max= Math.round(max* 100.0) / 100.0;
		DecimalFormat df1 = new DecimalFormat("#0.00");
		max = Double.valueOf(df1.format(max));
		

	
		
}


	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
	Map m = new LinkedHashMap(values.size()); 
    
	for(int j=0;j<values.size();j++)
	{	
		 m.put((j+1)+"s", values.get(j)); 
	}
	obj1.put("values", m);
	obj1.put("maxcpu", max);
	obj1.put("avgcpu", avg);
	
	obj.put("sampletransaction", obj1);
	
	JSONArray ja = new JSONArray(); 
	
	ja.add(obj);
	
	
	
	try(FileWriter file = new FileWriter("myJSON.json"))
	{
		file.write(ja.toString());
		file.flush();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
	
	System.out.println(ja);
	
}
	
}