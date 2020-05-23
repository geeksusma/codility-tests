package es.martagon.missinginteger;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MissingIntegerTest {

	private MissingInteger missingInteger;
	

    @Before
    public void setUp() {
    	missingInteger = new MissingInteger();
    }
    
	@Test
	public void should_expected_when_positiveSearch() {
		//given
		final int [] A= {1,3,6,4,1,2};
		final int expected = 5;
		//when
		int solution = missingInteger.solution(A);
		//then
        assertThat(solution).isEqualTo(expected);
	}


	@Test
	public void should_expected_when_negativeSearch() {
		//given
		final int [] A= {-1,-3};
		final int expected = 1;
		//when
		int solution = missingInteger.solution(A);
		//then
        assertThat(solution).isEqualTo(expected);
	}
	

	@Test
	public void should_expected_when_allConsecutive() {
		//given
		final int [] A= {1,2,3};
		final int expected = 4;
		//when
		int solution = missingInteger.solution(A);
		//then
        assertThat(solution).isEqualTo(expected);
	}
}
