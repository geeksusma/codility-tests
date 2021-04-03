package es.agustinventura.oddoccurrences;


import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    Solution sut;

    @Before
    public void setUp() {
        sut = new Solution();
    }

    @Test(expected = IllegalArgumentException.class)
    public void emptyArrayShouldThrowException() {
        sut.solution(new int[] {});
    }

    @Test(expected = IllegalArgumentException.class)
    public void evenLengthArrayShouldThrowException() {
        sut.solution(new int[] {1, 1});
    }

    @Test
    public void shouldFindOddNumber() {
        assertThat(sut.solution(new int[]{9,3,9,3,9,7,9})).isEqualTo(7);
    }

}
