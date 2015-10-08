package eu.ooti.forumlite;

import com.googlecode.lanterna.screen.Screen;

public class String_show {
	public static void string_show  (String str)
	{
		if (str.equals("o"))
		{
			int result[][] = {{0,0,0,0,0},{0,1,1,1,0},{0,1,0,1,0},{0,1,1,1,0},{0,0,0,0,0}};
			Display display;
			display.display0(result);
		}
		/*for( int i = 0; i<5; ++i)
		{
			for(int j=0; j<5; ++j)
			{
				out.print(result[i][j] + " ");
			}
			out.println();
		}*/
	}
}
