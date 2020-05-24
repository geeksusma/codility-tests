package es.martagon.frogriverone;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class FrogRiverOneTest {

	private FrogRiverOne frogRiverOne;

	@Before
	public void setUp() {
		frogRiverOne = new FrogRiverOne();
	}

	
	@Test
	public void should_expected_when_jumpToRiverOne() {
		//given
		final int [] jumps = {1,3,1,4,2,3,5,4};
		final int expected = 6;
		final int river = 5;
		
		//when
		int solution = frogRiverOne.solution(river, jumps);
		
		//then
		assertThat(solution).isEqualTo(expected);
	}


	@Test
	public void should_expected_when_noJumpToRiverOne() {
		//given
		final int [] jumps = {1,3,1,4,2,3,5,4};
		final int expected = -1;
		final int river = 7;
		
		//when
		int solution = frogRiverOne.solution(river, jumps);
		
		//then
		assertThat(solution).isEqualTo(expected);
	}
}
