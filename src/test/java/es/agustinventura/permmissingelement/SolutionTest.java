package es.agustinventura.permmissingelement;


import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    Solution sut;

    @Before
    public void setUp() {
        sut = new Solution();
    }

    @Test
    public void givenAnEmptyArrayShouldThrowException() {
        assertThat(sut.solution(new int[]{})).isEqualTo(1);
    }

    @Test
    public void givenAnArrayWithOnePositionAndNoOneShouldReturnOne() {
        assertThat(sut.solution(new int[]{2})).isEqualTo(1);
    }

    @Test
    public void givenAnArrayWithOnePositionAndNoTwoShouldReturnTwo() {
        assertThat(sut.solution(new int[]{1})).isEqualTo(2);
    }

    @Test
    public void givenAnArrayWithFourPositionsAndNoFourShouldReturnFour() {
        assertThat(sut.solution(new int[]{2,3,1,5})).isEqualTo(4);
    }
}