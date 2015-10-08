package eu.ooti.forumlite;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.List;

public class MovieReaderTest {

	@Test
	public void test() {
		List<String> movie = MovieReader.ReadFullMovie("C:\\tools\\hello.txt");
		assertThat(movie).isNotNull();
		assertThat(movie.size()).isEqualTo(4);
	}

}
