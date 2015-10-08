package eu.ooti.forumlite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MovieReader {
	
	public static void ReadMovie(Display display){
			List<String> allMovie = ReadFullMovie(".\\files\\Movie1.txt");
			try {
		           for(String strLine : allMovie){
		                String_show.string_show(strLine, display);
		                // sleep
		                Thread.sleep(2000);
		            }
			 }
			catch(Exception e){}
	}
	
	public static List<String> ReadFullMovie(String filepath)
	{
		 BufferedReader br = null;
		 List<String> allMovie = new ArrayList<>();
	        String strLine = "";
	        try {
	            br = new BufferedReader( new FileReader(filepath));
	            while( (strLine = br.readLine()) != null){
	            	allMovie.add(strLine);
	            }
	        }
		catch(Exception e){}
	        return allMovie;
	}
	
	public static void ReadMovie(String filepath, Display display)
	{
		List<String> allMovie = ReadFullMovie(filepath);
		try {
	           for(String strLine : allMovie){
	                String_show.string_show(strLine, display);
	                // sleep
	                Thread.sleep(1000);
	            }
		 }
		catch(Exception e){}
	}
	
}
