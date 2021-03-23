package es.martagon.genomicrangequery;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class GenomicRangeQueryTest {

private GenomicRangeQuery genomicRangeQuery;
	
	@Before
	public void setup() {
		genomicRangeQuery = new GenomicRangeQuery();
	}
	
	@Test
	public void should_expected_when_applyOperation() {
		//given
		final String S="CAGCCTA";
		final int [] P = {2,5,0};
		final int [] Q = {4,5,6};
		final int [] expected = {2,4,1};
		
		//when
		int [] solution = genomicRangeQuery.solution(S,P,Q);
		
		//then
        assertThat(solution).isEqualTo(expected);
	}
	
	
}
