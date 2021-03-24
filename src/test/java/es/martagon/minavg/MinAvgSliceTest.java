package es.martagon.minavg;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MinAvgSliceTest {


	private MinAvgSlice minAvgSlice;
	

    @Before
    public void setUp() {
    	minAvgSlice = new MinAvgSlice();
    }

	@Test
	public void should_min_when_combineZeroOne() {
		//given
		final int [] A= {4,2,2,5,1,5,8};
		final int expected = 1;
		//when
		int solution = minAvgSlice.solution(A);
		//then
        assertThat(solution).isEqualTo(expected);
	}

	@Test
	public void should_minExpected_when_quadruple() {
		//given
		final int [] A= {5, 6, 3, 4, 9};
		final int expected = 2;
		//when
		int solution = minAvgSlice.solution(A);
		//then
        assertThat(solution).isEqualTo(expected);
	}


	@Test
	public void should_minExpected_when_negative() {
		//given
		final int [] A= {-3, -5, -8, -4, -10};
		final int expected = 2;
		//when
		int solution = minAvgSlice.solution(A);
		//then
        assertThat(solution).isEqualTo(expected);
	}
	
	
}
