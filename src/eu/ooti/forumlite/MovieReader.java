package eu.ooti.forumlite;

import java.io.BufferedReader;
import java.io.FileReader;

public class MovieReader {
	
	public static void ReadMovie()
	{
		 BufferedReader br = null;
	        String strLine = "";
	        try {
	            br = new BufferedReader( new FileReader("files\\Movie1.txt"));
	            while( (strLine = br.readLine()) != null){
	                System.out.println(strLine);
	                String_show.string_show(strLine);
	                // sleep
	                Thread.sleep(2000);
	            }
	        }
		catch(Exception e){}
	}

}
