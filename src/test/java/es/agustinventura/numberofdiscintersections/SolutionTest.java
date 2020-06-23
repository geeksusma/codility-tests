package es.agustinventura.numberofdiscintersections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution sut;

    @BeforeEach
    public void setUp() {
        sut = new Solution();
    }

    @Test
    public void givenNullDiscsShouldReturnZero() {
        assertThat(sut.solution(null)).isEqualTo(0);
    }

    @Test
    public void givenEmptyDiscsShouldReturnZero() {
        assertThat(sut.solution(new int[]{})).isEqualTo(0);
    }

    @Test
    public void givenOneDiscShouldReturnZero() {
        assertThat(sut.solution(new int[] {1})).isEqualTo(0);
    }

    @Test
    public void givenTwoDiscsShouldReturnOne() {
        assertThat(sut.solution(new int[]{1,1})).isEqualTo(1);
    }

    @Test
    public void givenThreeDiscsShouldReturnTwo() {
        assertThat(sut.solution(new int[]{1,1, 0})).isEqualTo(2);
    }

    @Test
    public void givenSixDiscsShouldReturnEleven() {
        assertThat(sut.solution(new int[]{1,5,2,1,4,0})).isEqualTo(11);
    }
}
