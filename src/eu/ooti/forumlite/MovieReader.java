package eu.ooti.forumlite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MovieReader {
	
	public static void ReadMovie(Display display, String colour){
			List<String> allMovie = ReadFullMovie(".\\files\\Movie1.txt");
			try {
		           for(String strLine : allMovie){
		                String_show.string_show(strLine, colour, display);
		                // sleep
		              //  Thread.sleep(500);
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
	
	public static void ReadMovie(String filepath, String colour, Display display)
	{
		List<String> allMovie = ReadFullMovie(filepath);
		try {
	           for(String strLine : allMovie){
	                String_show.string_show(strLine, colour, display);
	                // sleep
	                Thread.sleep(500);
	            }
		 }
		catch(Exception e){}
	}
	
	
	/*
	 * this should be able to read files with 
	 * word@color   
	 * Example:
	 *  oOooO@red
	 *  oOooO@blue
	 *  
	 *  
	 *  Updatable:
	 *  oOooO@rrbbw   // red,red,blue,blue,white
	 */
	public static void coloredMovie(String filepath, String colour, Display display)
	{
		List<String> allMovie = ReadFullMovie(filepath);
		try {
				String word = "";
				String color = "";
				
	           for(String strLine : allMovie){
	        	   StringTokenizer tk = new StringTokenizer(strLine,"@");
	        	   word = tk.nextToken();
	        	   color = tk.nextToken();
	               String_show.string_show(word, color, display);
	                // sleep
	                Thread.sleep(500);
	            }
		 }
		catch(Exception e){}
	}
	
}
