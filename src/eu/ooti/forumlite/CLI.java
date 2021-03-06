/**
 * 
 */
package eu.ooti.forumlite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author IMikovsk
 *
 */
public class CLI {
	
	static String_show show = null;

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		boolean exit = false;
		Display display = new Display();
		printHelp();
		
		while(!exit){
			System.out.print("Input command: ");
			Scanner scanner = new Scanner(System.in);
			String strInput = scanner.nextLine();
			System.out.println("Input >> " + strInput);
			//multiple tokens on line
			List<String> arguments = new ArrayList<>();
			arguments = extractArgs(strInput);
			
			String command = arguments.get(0);
			if(command.equalsIgnoreCase("show")){
				/*
				 *  - check number of arguments
				 * - check if there is color param, use default if not
				 */
				try {
					if(arguments.size() == 2){
						arguments.add("white");
					}
					String_show.string_show(arguments.get(1),arguments.get(2),display);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if (command.equalsIgnoreCase("movie")){
				if(arguments.size() == 2){
					MovieReader.ReadMovie(display, arguments.get(1));
				}else{
					MovieReader.ReadMovie(arguments.get(1), arguments.get(2), display);
				}
				
			}
			if(command.equalsIgnoreCase("exit") || command.equalsIgnoreCase("q")){
				exit = true;
				display.close();
				System.out.println("Bye bye!");
			}
		}
		// TODO need to show help
	}

	private static void printHelp() {
		System.out.println("======================== HELP ========================");
		System.out.println("show <word>                  -- shows the word on the display on white");
		System.out.println("show <word> <color>          -- shows the word on the display with the specific color");
		System.out.println("movie <color>      		     -- reads file with name=moviename");
		System.out.println("movie <filename> <color>      -- reads file with name=moviename");
//		System.out.println("color 0..255 0..255 0..255 [0..5] -- sets the RGB color of the number of lights");
//		System.out.println("interval <number>  -- sets the time between frames of the movie");  
//		System.out.println("USAGE");
		System.out.println("exit / q  -- exit from the application");
	}

	private static List<String> extractArgs(String strInput) {
		List<String> result = new ArrayList<>();
		StringTokenizer tokenizer = new StringTokenizer(strInput);
		while(tokenizer.hasMoreTokens()){
			result.add(tokenizer.nextToken());
		}
		return result;
	}

}
