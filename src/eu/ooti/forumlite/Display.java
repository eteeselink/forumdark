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

	public void display(int result[][]) throws InterruptedException {
		int k = 10;
		for (int i = 0; i < 5; i++) {
			String s = "    ";
			for (int j = 0; j < 5; j++) {
				if (result[i][j] == 1) {
					s += "* ";
				} else {
					s += "  ";
				}
			}
			screen.putString(20, k, s, Color.WHITE, Color.BLACK, ScreenCharacterStyle.Bold);
			k++;
		}
		
		/*screen.putString(20, 10, "    *   *   *     *   *   *    *   *   *     *   *   *", foreground, Color.BLACK, ScreenCharacterStyle.Blinking);
		screen.putString(20, 11, "      * * *         * * *        * * *         * * *  ", foreground, Color.BLACK, ScreenCharacterStyle.Blinking);
		screen.putString(20, 12, "    * * * * *     * * * * *    * * * * *     * * * * *", foreground, Color.BLACK, ScreenCharacterStyle.Blinking);
		screen.putString(20, 13, "      * * *         * * *        * * *         * * *  ", foreground, Color.BLACK, ScreenCharacterStyle.Blinking);
		screen.putString(20, 14, "    *   *   *     *   *   *    *   *   *     *   *   *", foreground, Color.BLACK, ScreenCharacterStyle.Blinking);
		*/screen.refresh();
		Thread.sleep(2000);
		
		screen.clear();
		screen.refresh();
	}
}
