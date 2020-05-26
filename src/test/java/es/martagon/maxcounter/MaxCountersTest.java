package es.martagon.maxcounter;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class MaxCountersTest {

	private MaxCounters maxCounters;
	
	@Before
	public void setup() {
		maxCounters = new MaxCounters();
	}
	
	@Test
	public void should_expected_when_applyOperation() {
		//given
		final int [] operations = {3,4,4,6,1,4,4};
		final int [] expected = {3,2,2,4,2};
		final int N = 5;
		
		//when
		int [] solution = maxCounters.solution(N, operations);
		
		//then
        assertThat(solution).isEqualTo(expected);
	}

}
