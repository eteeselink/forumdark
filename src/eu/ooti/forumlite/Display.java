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

	public void displayO() throws InterruptedException {
		/*screen.putString(20, 10, "    *   *   *     *   *   *    *   *   *     *   *   *", foreground, Color.BLACK, ScreenCharacterStyle.Blinking);
		screen.putString(20, 11, "      * * *         * * *        * * *         * * *  ", foreground, Color.BLACK, ScreenCharacterStyle.Blinking);
		screen.putString(20, 12, "    * * * * *     * * * * *    * * * * *     * * * * *", foreground, Color.BLACK, ScreenCharacterStyle.Blinking);
		screen.putString(20, 13, "      * * *         * * *        * * *         * * *  ", foreground, Color.BLACK, ScreenCharacterStyle.Blinking);
		screen.putString(20, 14, "    *   *   *     *   *   *    *   *   *     *   *   *", foreground, Color.BLACK, ScreenCharacterStyle.Blinking);
		screen.refresh();*/
		Thread.sleep(2000);
		
		screen.clear();
		screen.refresh();
	}
}
