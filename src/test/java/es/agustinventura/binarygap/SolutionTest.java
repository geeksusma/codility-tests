package es.agustinventura.binarygap;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

	private Solution sut;

	@Before
	public void setUp() {
		sut = new Solution();
	}

	@Test
	public void zeroShouldReturnZero() {
		assertThat(sut.solution(0)).isEqualTo(0);
	}

	@Test
	public void nineShouldReturnTwo() {
		assertThat(sut.solution(9)).isEqualTo(2);
	}

	@Test
	public void fifteenShouldReturnZero() {
		assertThat(sut.solution(15)).isEqualTo(0);
	}

	@Test
	public void thirtyTwoShouldReturnZero() {
		assertThat(sut.solution(32)).isEqualTo(0);
	}

	@Test
	public void twentyShouldReturnOne() {
		assertThat(sut.solution(20)).isEqualTo(1);
	}

	@Test
	public void fiveHundredTwentyNineShouldReturnFour() {
		assertThat(sut.solution(529)).isEqualTo(4);
	}

}
