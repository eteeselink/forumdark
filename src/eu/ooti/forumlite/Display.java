package eu.ooti.forumlite;

import java.util.List;

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

	private void displayBlock(int matrix[][], int x, com.googlecode.lanterna.terminal.Terminal.Color color) {
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
			screen.putString(x, k, s, color, Color.BLACK, ScreenCharacterStyle.Bold);
			k++;
		}
	}
	
	public void display(
			/*int matrix1[][], 
			int matrix2[][], 
			int matrix3[][],
			int matrix4[][],
			int matrix5[][]*/ List<int[][]> matrices, String col) throws InterruptedException {
		
		com.googlecode.lanterna.terminal.Terminal.Color color = Color.WHITE;
		
		
		switch (col) {
		case "red": // blue
			color = Color.RED;
			break;
		case "green": // blue
			color = Color.GREEN;
			break;
		case "blue": // blue
			color = Color.BLUE;
			break;
		}
		
		int matrix1[][] = matrices.get(0);
		int matrix2[][] = matrices.get(1);
		int matrix3[][] = matrices.get(2);
		int matrix4[][] = matrices.get(3);
		int matrix5[][] = matrices.get(4);
		
		displayBlock(matrix1, 15, color);
		displayBlock(matrix2, 30, color);
		displayBlock(matrix3, 45, color);
		displayBlock(matrix4, 60, color);
		displayBlock(matrix5, 75, color);
		
		/*
		screen.putString(20, 10, "    *   *   *     *   *   *    *   *   *     *   *   *", foreground, Color.BLACK, ScreenCharacterStyle.Blinking);
		screen.putString(20, 11, "      * * *         * * *        * * *         * * *  ", foreground, Color.BLACK, ScreenCharacterStyle.Blinking);
		screen.putString(20, 12, "    * * * * *     * * * * *    * * * * *     * * * * *", foreground, Color.BLACK, ScreenCharacterStyle.Blinking);
		screen.putString(20, 13, "      * * *         * * *        * * *         * * *  ", foreground, Color.BLACK, ScreenCharacterStyle.Blinking);
		screen.putString(20, 14, "    *   *   *     *   *   *    *   *   *     *   *   *", foreground, Color.BLACK, ScreenCharacterStyle.Blinking);
		*/screen.refresh();
		Thread.sleep(500);
		
		screen.clear();
		screen.refresh();
	}
}
