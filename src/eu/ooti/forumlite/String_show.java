package eu.ooti.forumlite;

public class String_show {
	public static void string_show (String str, Display display) throws Exception
	{
		int matrix0[][] = null;
		int matrix1[][] = null;
		int matrix2[][] = null;
		int matrix3[][] = null;
		int matrix4[][] = null;
		
		for (int i = 0; i < 5; ++i)
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
