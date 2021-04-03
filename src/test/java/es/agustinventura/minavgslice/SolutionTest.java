package es.agustinventura.minavgslice;

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
    public void givenOneElementArrayShouldReturnZero() {
        assertThat(sut.solution(new int[] {0})).isEqualTo(0);
    }

    @Test
    public void givenTwoElementsArrayShouldReturnZero() {
        assertThat(sut.solution(new int[] {0, 1})).isEqualTo(0);
    }

    @Test
    public void givenThreeElementsArrayShouldReturnOne() {
        assertThat(sut.solution(new int[] {5, 1, 2})).isEqualTo(1);
    }

    @Test
    public void givenSevenElementsArrayShouldReturnOne() {
        assertThat(sut.solution(new int[] {4, 2, 2, 5, 1, 5, 8})).isEqualTo(1);
    }
}