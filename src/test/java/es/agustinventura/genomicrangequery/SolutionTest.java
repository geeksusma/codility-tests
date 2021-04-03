package es.agustinventura.genomicrangequery;


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
    public void givenNullStringShouldReturnEmptyArray() {
        assertThat(sut.solution(null, new int[]{}, new int[]{})).isEqualTo(new int[]{});
    }

    @Test
    public void givenEmptyStringShouldReturnEmptyArray() {
        assertThat(sut.solution("", new int[]{}, new int[]{})).isEqualTo(new int[]{});
    }

    @Test
    public void givenEmptyQueriesShouldReturnEmptyArray() {
        assertThat(sut.solution("A", new int[]{}, new int[]{})).isEqualTo(new int[]{});
    }

    @Test
    public void givenEmptyFirstQueryShouldReturnEmptyArray() {
        assertThat(sut.solution("A", new int[]{}, new int[]{2})).isEqualTo(new int[]{});
    }

    @Test
    public void givenEmptySecondQueryShouldReturnEmptyArray() {
        assertThat(sut.solution("A", new int[]{2}, new int[]{})).isEqualTo(new int[]{});
    }

    @Test
    public void givenCAGCCTAAndQueries250and456ShouldReturn241() {
        assertThat(sut.solution("CAGCCTA", new int[]{2,5,0}, new int[]{4,5,6})).isEqualTo(new int[]{2,4,1});
    }
}
