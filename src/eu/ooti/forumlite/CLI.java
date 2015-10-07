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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean exit = false;
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
//				String_show show = new String_show();
//				show.string_show(arguments.get(1));	
				String_show.string_show(arguments.get(1));
			}
			
			if (command.equalsIgnoreCase("movie")){
				MovieReader.ReadMovie();
			}
			if(command.equalsIgnoreCase("exit") || command.equalsIgnoreCase("q")){
				exit = true;
				System.out.println("Bye bye!");
			}
		}
		// TODO need to show help
		
		
				
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
