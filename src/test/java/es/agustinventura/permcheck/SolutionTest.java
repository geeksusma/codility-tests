package es.agustinventura.permcheck;


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
    public void givenNullArrayShouldReturnZero() {
        assertThat(sut.solution(null)).isEqualTo(0);
    }

    @Test
    public void givenEmptyArrayShouldReturnOne() {
        assertThat(sut.solution(new int[]{})).isEqualTo(1);
    }

    @Test
    public void givenAOneElementArrayWithOneShouldReturnOne() {
        assertThat(sut.solution(new int[]{1})).isEqualTo(1);
    }

    @Test
    public void givenAOneElementArrayWithTwoShouldReturnZero() {
        assertThat(sut.solution(new int[]{2})).isEqualTo(0);
    }

    @Test
    public void givenATwoElementsArrayWithOneAndTwoShouldReturnOne() {
        assertThat(sut.solution(new int[]{1, 2})).isEqualTo(1);
    }

    @Test
    public void givenATwoElementsArrayWithTwoAndOneShouldReturnOne() {
        assertThat(sut.solution(new int[]{2, 1})).isEqualTo(1);
    }

    @Test
    public void givenATwoElementsArrayWithOneAndThreeShouldReturnZero() {
        assertThat(sut.solution(new int[]{1, 3})).isEqualTo(0);
    }

    @Test
    public void givenATwoElementsArrayWithThreeAndOneShouldReturnZero() {
        assertThat(sut.solution(new int[]{3, 1})).isEqualTo(0);
    }

    @Test
    public void givenATwoElementsArrayWithMinusOneAndZeroShouldReturnZero() {
        assertThat(sut.solution(new int[]{-1, 0})).isEqualTo(0);
    }

    @Test
    public void givenAnUnorderedFourElementsArrayShouldReturnOne() {
        assertThat(sut.solution(new int[]{4, 1, 3, 2})).isEqualTo(1);
    }

    @Test
    public void givenAnUnorderedThreeElementsArrayShouldReturnZero() {
        assertThat(sut.solution(new int[]{4, 1, 3})).isEqualTo(0);
    }
}