package chapter5;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.*;

public class find_price_file {

	public static void main(String[] args) throws Exception 
	{
		Pattern p=Pattern.compile("\\d+");
		File f=new File("D:\\codes_java\\CSW2\\src\\chapter5\\price_find");
		BufferedReader br=new BufferedReader(new FileReader(f));
		String line;
		int value=0;
		while((line=br.readLine())!=null)
		{
			Matcher m=p.matcher(line);
			if(m.find())
			{
				String []a=line.split("\\s+");
				value=value+(Integer.parseInt(a[1])*Integer.parseInt(a[2]));
			}
			
		}
		System.out.println("total value of the goods is "+value);

		br.close();
	}

}
