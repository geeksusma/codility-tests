package es.martagon.frogjumps;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

import es.geeksusma.frogjumps.FrogJumps;

public class FrogJumpsTest {

	private FrogJumps frogJumps;

	@Before
	public void setUp() {
		frogJumps = new FrogJumps();
	}

	@Test
	public void should_calculateJumps_when_frogJumps() {
		// when
		final int solution = frogJumps.solution(10, 80, 30);

		// then
		assertThat(solution).isEqualTo(3);
	}

}
