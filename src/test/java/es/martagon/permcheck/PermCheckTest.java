package es.martagon.permcheck;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class PermCheckTest {

	private PermCheck permCheck ;
	
    @Before
    public void setUp() {
    	permCheck = new PermCheck();
    }
    
	@Test
	public void should_expected_when_arrayIsPermutation() {
		//given
		final int [] A= {4,1,3,2};
		final int expected = 1;
		//when
		int solution = permCheck.solution(A);
		//then
        assertThat(solution).isEqualTo(expected);
	}
	
	@Test
	public void should_expected_when_arrayIsNotPermutation() {
		//given
		final int [] A= {4,1,3};
		final int expected = 0;
		//when
		int solution = permCheck.solution(A);
		//then
        assertThat(solution).isEqualTo(expected);
	}

	@Test
	public void should_expected_when_arrayMinIsTwoAndIsPermutation() {
		//given
		final int [] A= {4,3,2};
		final int expected = 1;
		//when
		int solution = permCheck.solution(A);
		//then
        assertThat(solution).isEqualTo(expected);
	}
	

	@Test
	public void should_expected_when_arrayMinIsMayorOneAndIsPermutation() {
		//given
		final int [] A= {4,3,5};
		final int expected = 1;
		//when
		int solution = permCheck.solution(A);
		//then
        assertThat(solution).isEqualTo(expected);
	}
}
