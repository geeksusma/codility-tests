package es.martagon.permmissingelement;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class PermMissingTest {

	private PermMissing permMissing;

	@Before
	public void setUp() {
		permMissing = new PermMissing();
	}

	@Test
	public void should_return_4_when_4_is_missing() {
		int[] params = { 3, 2, 5, 1 };
		int expected = 4;

		int solution = permMissing.solution(params);

		assertThat(solution).isEqualTo(expected);
	}

	@Test
	public void should_return_1_when_first_item_is_missing() {
		int[] params = { 3, 2, 5, 4 };
		int expected = 1;

		int solution = permMissing.solution(params);

		assertThat(solution).isEqualTo(expected);
	}

	@Test
	public void should_return_2_when_only_one_item() {
		int[] params = { 1 };
		int expected = 2;

		int solution = permMissing.solution(params);

		assertThat(solution).isEqualTo(expected);
	}

	@Test
	public void should_return_1_when_list_is_empty() {
		int[] params = {};
		int expected = 1;

		int solution = permMissing.solution(params);

		assertThat(solution).isEqualTo(expected);
	}

	@Test
	public void should_return_5_when_last_item_is_missing() {
		int[] params = { 3, 2, 1, 4 };
		int expected = 5;

		int solution = permMissing.solution(params);

		assertThat(solution).isEqualTo(expected);
	}
}
