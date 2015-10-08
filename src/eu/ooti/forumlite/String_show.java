package eu.ooti.forumlite;

public class String_show {
	public static void string_show (String str, Display display) throws Exception
	{
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
		
		//Display display = new Display();
		display.display(matrix0, matrix1, matrix2, matrix3, matrix4);
		//display.close();	
	}
}
