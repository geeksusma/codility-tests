package es.agustinventura.passingcars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution sut;

    @BeforeEach
    private void setUp() {
        sut = new Solution();
    }

    @Test
    public void givenAOneElementArrayShouldReturnZero() {
        assertThat(sut.solution(new int[] {})).isEqualTo(0);
    }

    @Test
    public void givenATwoElementArrayFilledWithZeroesShouldReturnZero() {
        assertThat(sut.solution(new int[]{0,0})).isEqualTo(0);
    }

    @Test
    public void givenATwoElementArrayFilledWithOnesShouldReturnZero() {
        assertThat(sut.solution(new int[]{1,1})).isEqualTo(0);
    }

    @Test
    public void givenATwoElementArrayFilledWithOneAndZeroShouldReturnZero() {
        assertThat(sut.solution(new int[]{1,0})).isEqualTo(0);
    }

    @Test
    public void givenATwoElementArrayFilledWithZeroAndOneShouldReturnOne() {
        assertThat(sut.solution(new int[]{0,1})).isEqualTo(1);
    }

    @Test
    public void givenAOneMillionAndTwoElementsArrayFilledWithZeroAndAMillionAndOneOnesShouldReturnAMillion() {
        int[] bigArray = new int[1_000_002];
        Arrays.fill(bigArray, 1);
        bigArray[0] = 0;
        assertThat(sut.solution(bigArray)).isEqualTo(-1);
    }
}