package es.martagon.passingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class PassingCarTest {

	private PassingCar passingCar;
	

    @Before
    public void setUp() {
    	passingCar = new PassingCar();
    }
    
	@Test
	public void should_expected_when_combineZeroOne() {
		//given
		final int [] A= {0,1,0,1,1};
		final int expected = 5;
		//when
		int solution = passingCar.solution(A);
		//then
        assertThat(solution).isEqualTo(expected);
	}
	

	@Test
	public void should_expected_when_onlyZero() {
		//given
		final int [] A= {0,0,0,0,0};
		final int expected = 0;
		//when
		int solution = passingCar.solution(A);
		//then
        assertThat(solution).isEqualTo(expected);
	}


	@Test
	public void should_expected_when_onlyOne() {
		//given
		final int [] A= {1,1,1,1,1,1,1};
		final int expected = 0;
		//when
		int solution = passingCar.solution(A);
		//then
        assertThat(solution).isEqualTo(expected);
	}
	

	// could be slow
	@Test
	public void should_expected_when_upmax() {
		//given
		final int  MAX = 1_000_000_000;
		final int [] A= new int [MAX+2];
		for (int i=0; i<A.length;i++) {
			if (i==0) {
				A[i]=0;
			}else {
				A[i]=1;
			}
		}
		final int expected = -1;
		//when
		int solution = passingCar.solution(A);
		//then
        assertThat(solution).isEqualTo(expected);
	}
	

	// could be slow
	@Test
	public void should_expected_when_ismax() {
		//given
		final int  MAX = 1_000_000_000;
		final int [] A= new int [MAX+1];
		for (int i=0; i<A.length;i++) {
			if (i==0) {
				A[i]=0;
			}else {
				A[i]=1;
			}
		}
		final int expected = MAX;
		//when
		int solution = passingCar.solution(A);
		//then
        assertThat(solution).isEqualTo(expected);
	}
}
