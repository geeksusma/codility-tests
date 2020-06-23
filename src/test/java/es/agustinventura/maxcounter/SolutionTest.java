package es.agustinventura.maxcounter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution sut;

    @BeforeEach
    private void setUp() {
        sut = new Solution();
    }

    @Test
    public void givenNoCountersShouldReturnEmptyArray() {
        assertThat(sut.solution(0, new int[] {})).isEmpty();
    }

    @Test
    public void givenNoInstructionsShouldReturnAnArrayWithCounterZeroes() {
        assertThat(sut.solution(1, new int[] {})).isEqualTo(new int [] {0});
        assertThat(sut.solution(1, new int[] {}).length).isEqualTo(1);
    }

    @Test
    public void givenIncrementInstructionOverOneCounterShouldReturnAnArrayWithCountersZeroesAndTheIncrementedOneAtOne() {
        assertThat(sut.solution(2, new int[] {1})).isEqualTo(new int [] {1, 0});
    }

    @Test
    public void givenMaximizeInstructionOverTwoCountersShouldReturnAnArrayWithCounterZeroes() {
        assertThat(sut.solution(2, new int[] {3})).isEqualTo(new int [] {0, 0});
    }

    @Test
    public void givenIncrementAndMaximizeIntructionOverTwoCountersShouldReturnAnArrayWithCounterOnes() {
        assertThat(sut.solution(2, new int[] {1, 3})).isEqualTo(new int [] {1, 1});
    }

    @Test
    public void givenFiveCountersAndVariousOperationsShouldReturnThemApplied() {
        assertThat(sut.solution(5, new int[] {3, 4, 4, 6, 1, 4, 4})).isEqualTo(new int [] {3, 2, 2, 4, 2});
    }
}
