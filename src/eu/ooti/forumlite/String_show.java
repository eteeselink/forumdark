package eu.ooti.forumlite;

import static java.lang.System.out;

import com.googlecode.lanterna.screen.Screen;

public class String_show implements AutoCloseable {
	public static int[][] string_show  (String str)
	{
		int result[][] = new int[5][5];
		
		int testResult[][] = {{0,0,0,0,0},{0,1,1,1,0},{0,1,0,1,0},{0,1,1,1,0},{0,0,0,0,0}};
		
		result = testResult;
		
		for( int i = 0; i<5; ++i)
		{
			for(int j=0; j<5; ++j)
			{
				out.print(result[i][j] + " ");
			}
			out.println();
		}
		
		/*if (str == "o")
			result = */
		
		return result;
	}
	
	public void close() throws Exception {
		screen.stopScreen();
	}
}
