package eu.ooti.forumlite;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.ScreenCharacterStyle;
import com.googlecode.lanterna.terminal.Terminal.Color;

public class Display implements AutoCloseable {
	private final Screen screen;

	public Display() {
		screen = TerminalFacade.createScreen();
		screen.startScreen();
	}
	
	@Override
	public void close() throws Exception {
		screen.stopScreen();
	}
	
	public Screen getScreen() {
		return screen;
	}

	private void displayBlock(int matrix[][], int x) {
		int k = 10;
		for (int i = 0; i < 5; i++) {
			String s = " ";
			for (int j = 0; j < 5; j++) {
				if (matrix[i][j] == 1) {
					s += "* ";
				} else {
					s += "  ";
				}
			}
			screen.putString(x, k, s, Color.WHITE, Color.BLACK, ScreenCharacterStyle.Bold);
			k++;
		}
	}
	
	public void display(
			int matrix1[][], 
			int matrix2[][], 
			int matrix3[][],
			int matrix4[][],
			int matrix5[][]) throws InterruptedException {
		
		displayBlock(matrix1, 15);
		displayBlock(matrix2, 30);
		displayBlock(matrix3, 45);
		displayBlock(matrix4, 60);
		displayBlock(matrix5, 75);
		
		/*
		screen.putString(20, 10, "    *   *   *     *   *   *    *   *   *     *   *   *", foreground, Color.BLACK, ScreenCharacterStyle.Blinking);
		screen.putString(20, 11, "      * * *         * * *        * * *         * * *  ", foreground, Color.BLACK, ScreenCharacterStyle.Blinking);
		screen.putString(20, 12, "    * * * * *     * * * * *    * * * * *     * * * * *", foreground, Color.BLACK, ScreenCharacterStyle.Blinking);
		screen.putString(20, 13, "      * * *         * * *        * * *         * * *  ", foreground, Color.BLACK, ScreenCharacterStyle.Blinking);
		screen.putString(20, 14, "    *   *   *     *   *   *    *   *   *     *   *   *", foreground, Color.BLACK, ScreenCharacterStyle.Blinking);
		*/screen.refresh();
		Thread.sleep(4000);
		
		screen.clear();
		screen.refresh();
	}
}
