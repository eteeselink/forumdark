package eu.ooti.forumlite;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.Test;

public class StringShowTest {

	@Test
	public void testMakeCharacters() throws Exception {
		List<int[][]> matrices = String_show.makeCharacters("Oo.oO");
		assertThat(matrices.size()).isEqualTo(5);
		assertThat(matrices.get(0)[0][0]).isEqualTo(1);
	}
	
	@Test
	public void testMakeMoreCharacters() throws Exception {
		List<int[][]> matrices = String_show.makeCharacters("Oo. .oO");
		assertThat(matrices.size()).isEqualTo(7);
		assertThat(matrices.get(0)[0][0]).isEqualTo(1);
		assertThat(matrices.get(6)[0]).containsOnly(1);
	}

}
