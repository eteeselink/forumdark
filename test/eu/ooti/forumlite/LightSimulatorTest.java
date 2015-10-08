package eu.ooti.forumlite;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.TerminalSize;

public class LightSimulatorTest {

	@Test
	public void test() throws Exception {
		try(LightSimulator sim = new LightSimulator()) {
			Screen screen = sim.getScreen();
			TerminalSize size = screen.getTerminalSize();
			assertThat(size.getColumns()).isGreaterThan(10);
			assertThat(size.getRows()).isGreaterThan(10);
			System.out.println("hi");
		}
	}
	
	@Test
	public void TestMovieReader() throws Exception {
		List<String> testmovie = MovieReader.ReadFullMovie(".\\files\\Movie1.txt");
		assertThat(testmovie.size()).isEqualTo(5);
		
	}
	
//  The unit test below fails. Uncomment it if you want to see how CircleCI reacts
//  to a failing test.
//	
//	@Test
//	public void thisOneFails() throws Exception {
//		Screen screen;
//		try(LightSimulator sim = new LightSimulator()) {
//			screen = sim.getScreen();
//			TerminalSize size = screen.getTerminalSize();
//			assertThat(size.getColumns()).isGreaterThan(100);
//		}
//	}

}
