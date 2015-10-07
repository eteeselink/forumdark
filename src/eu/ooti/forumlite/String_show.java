package eu.ooti.forumlite;

import static java.lang.System.out;

public class String_show {
	public static boolean[][] string_show  (String str)
	{
		boolean result[][] = new boolean[5][5];
		
		for( int i = 0; i<5; ++i)
		{
			for(int j=0; j<5; ++j)
			{
				out.println(result[i][j]);
			}
		}
		
		/*if (str == "o")
			result = */
		
		return result;
	}
}
