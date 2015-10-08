package eu.ooti.forumlite;

import java.util.ArrayList;
import java.util.List;

public class String_show {
	public static List<int[][]> makeCharacters(String str) throws Exception {
		
		ArrayList<int[][]> matrices = new ArrayList<int[][]>();
		
		for (int i = 0; i < str.length(); ++i)
		{
			int workingMatrix[][] = new int[5][5];
						
			switch (str.charAt(i))
			{
				case 'o': workingMatrix = new int[][] {{0,0,0,0,0},
													   {0,1,1,1,0},
													   {0,1,0,1,0},
													   {0,1,1,1,0},
													   {0,0,0,0,0}};
				break;
				case 'O': workingMatrix = new int[][] {{1,1,1,1,1},
													   {1,0,0,0,1},
													   {1,0,0,0,1},
													   {1,0,0,0,1},
													   {1,1,1,1,1}};
				break;
				case '/': workingMatrix = new int[][] {{0,0,0,0,1},
													   {0,0,0,1,0},
													   {0,0,1,0,0},
													   {0,1,0,0,0},
													   {1,0,0,0,0}};
				break;
				case '\\': workingMatrix = new int[][] {{1,0,0,0,0},
													   {0,1,0,0,0},
													   {0,0,1,0,0},
													   {0,0,0,1,0},
													   {0,0,0,0,1}};
				break;
				case '|': workingMatrix = new int[][] {{0,0,1,0,0},
													   {0,0,1,0,0},
													   {0,0,1,0,0},
													   {0,0,1,0,0},
													   {0,0,1,0,0}};
				break;
				case '-': workingMatrix = new int[][] {{0,0,0,0,0},
													   {0,0,0,0,0},
													   {1,1,1,1,1},
													   {0,0,0,0,0},
													   {0,0,0,0,0}};
				break;
				case '.': workingMatrix = new int[][] {{0,0,0,0,0},
													   {0,0,0,0,0},
													   {0,0,0,0,0},
													   {0,0,0,0,0},
													   {0,0,1,0,0}};
				break;
				case '<': workingMatrix = new int[][] {{0,0,0,1,0},
					   								   {0,0,1,0,0},
					   								   {0,1,0,0,0},
					   								   {0,0,1,0,0},
					   								   {0,0,0,1,0}};
				break;
				case '>': workingMatrix = new int[][] {{0,1,0,0,0},
					   								   {0,0,1,0,0},
					   								   {0,0,0,1,0},
					   								   {0,0,1,0,0},
					   								   {0,1,0,0,0}};
			    break;
				default: workingMatrix = new int[][] {{0,0,0,0,0},
													  {0,0,0,0,0},
													  {0,0,0,0,0},
													  {0,0,0,0,0},
													  {0,0,0,0,0}};
				break;

			}
			matrices.add(workingMatrix);
		}
		return matrices;
	}
	public static void string_show (String str, String colour, Display display) throws Exception
	{
		List<int[][]> matrices = makeCharacters(str);
		display.display(matrices, colour);		
	}
}
