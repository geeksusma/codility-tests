package es.agustinventura.tapeequilibrium;

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
    public void givenAnNullArrayShouldReturnZero() {
        assertThat(sut.solution(null)).isEqualTo(0);
    }

    @Test
    public void givenAnEmptyArrayShouldReturnZero() {
        assertThat(sut.solution(new int[]{})).isEqualTo(0);
    }

    @Test
    public void givenAOneElementArrayShouldReturnZero() {
        assertThat(sut.solution(new int[]{1})).isEqualTo(0);
    }

    @Test
    public void givenATwoElementsArrayShouldReturnMinimalDifference() {
        assertThat(sut.solution(new int[]{1, 2})).isEqualTo(1);
    }

    @Test
    public void givenAThreeElementsArrayShouldReturnMinimalDifference() {
        assertThat(sut.solution(new int[]{1, 2, 3})).isEqualTo(0);
    }

    @Test
    public void givenExampleArrayShouldReturnOne() {
        assertThat(sut.solution(new int[]{3, 1, 2, 4, 3})).isEqualTo(1);
    }
}