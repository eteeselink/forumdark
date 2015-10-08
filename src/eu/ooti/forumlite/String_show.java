package eu.ooti.forumlite;

import java.util.ArrayList;
import java.util.List;

public class String_show {
	public static List<int[][]> makeCharacters(String str) throws Exception {
		int matrix0[][] = {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
		int matrix1[][] = {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
		int matrix2[][] = {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
		int matrix3[][] = {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
		int matrix4[][] = {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
		
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
			}
			
			switch (i)
			{
			case 0: matrix0 = workingMatrix;
			break;
			case 1: matrix1 = workingMatrix;
			break;
			case 2: matrix2 = workingMatrix;
			break;
			case 3: matrix3 = workingMatrix;
			break;
			case 4: matrix4 = workingMatrix;
			break;
			}
		}
		
		ArrayList<int[][]> list = new ArrayList<int[][]>();
		list.add(matrix0);
		list.add(matrix1);
		list.add(matrix2);
		list.add(matrix3);
		list.add(matrix4);

		return list;
	}
	public static void string_show (String str, Display display) throws Exception
	{
		List<int[][]> matrices = makeCharacters(str);
		
		//Display display = new Display();
		display.display(matrices.get(0),matrices.get(1), matrices.get(2), matrices.get(3), matrices.get(4));
		//display.close();	
	}
}
