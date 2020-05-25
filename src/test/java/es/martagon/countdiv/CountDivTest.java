package es.martagon.countdiv;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CountDivTest {

	private CountDiv countDiv;

	@Before
	public void setUp() {
		countDiv = new CountDiv();
	}

	@Test
	public void should_expected_when_begin_mod_end_no() {
		// given
		final int A = 6;
		final int B = 11;
		final int K = 2;
		final int expected = 3;

		// when
		int solution = countDiv.solution(A, B, K);

		// then
		assertThat(solution).isEqualTo(expected);
	}

	@Test
	public void should_expected_when_begin_end_K_same() {
		// given
		final int A = 10;
		final int B = 10;
		final int K = 10;
		final int expected = 1;

		// when
		int solution = countDiv.solution(A, B, K);

		// then
		assertThat(solution).isEqualTo(expected);
	}

	@Test
	public void should_expected_when_begin_end_nomod() {
		// given
		final int A = 11;
		final int B = 345;
		final int K = 17;
		final int expected = 20;

		// when
		int solution = countDiv.solution(A, B, K);

		// then
		assertThat(solution).isEqualTo(expected);
	}

	@Test
	public void should_expected_when_begin_zero() {
		// given
		final int A = 0;
		final int B = 2;
		final int K = 2;
		final int expected = 2;

		// when
		int solution = countDiv.solution(A, B, K);

		// then
		assertThat(solution).isEqualTo(expected);
	}

	@Test
	public void should_expected_when_begin_zero_mustcount() {
		// given
		final int A = 0;
		final int B = 13;
		final int K = 2;
		final int expected = 7;

		// when
		int solution = countDiv.solution(A, B, K);

		// then
		assertThat(solution).isEqualTo(expected);
	}

	@Test
	public void should_expected_when_begin_zero_mustcount_K_one() {
		// given
		final int A = 0;
		final int B = 10;
		final int K = 1;
		final int expected = 11;

		// when
		int solution = countDiv.solution(A, B, K);

		// then
		assertThat(solution).isEqualTo(expected);
	}

	@Test
	public void should_expected_when_begin_all_is_zero() {
		// given
		final int A = 0;
		final int B = 0;
		final int K = 100;
		final int expected = 1;

		// when
		int solution = countDiv.solution(A, B, K);

		// then
		assertThat(solution).isEqualTo(expected);
	}
	

	@Test
	public void should_expected_when_break_jumps() {
		// given
		final int A = 1;
		final int B = 6;
		final int K = 2;
		final int expected = 3;

		// when
		int solution = countDiv.solution(A, B, K);

		// then
		assertThat(solution).isEqualTo(expected);
	}	
	
	@Test
	public void should_expected_when_break_jumps2() {
		// given
		final int A = 11;
		final int B = 14;
		final int K = 2;
		final int expected = 2;

		// when
		int solution = countDiv.solution(A, B, K);

		// then
		assertThat(solution).isEqualTo(expected);
	}	
	
	@Test
	public void should_expected_when_break_K_one() {
		// given
		final int A = 1;
		final int B =  1;
		final int K = 1;
		final int expected = 1;

		// when
		int solution = countDiv.solution(A, B, K);

		// then
		assertThat(solution).isEqualTo(expected);
	}	

	@Test
	public void should_expected_when_break_zero() {
		// given
		final int A = 0;
		final int B =  2000000000;
		final int K = 2000000000;
		final int expected = 2;

		// when
		int solution = countDiv.solution(A, B, K);

		// then
		assertThat(solution).isEqualTo(expected);
	}	
}
