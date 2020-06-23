package es.agustinventura.frogriverone;

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
    public void givenANullArrayShouldReturnMinusOne() {
        assertThat(sut.solution(1, null)).isEqualTo(-1);
    }

    @Test
    public void givenAnEmptyArrayShouldReturnMinusOne() {
        assertThat(sut.solution(1, new int[]{})).isEqualTo(-1);
    }

    @Test
    public void givenAnUnReachablePointShouldReturnMinusOne() {
        assertThat(sut.solution(2, new int[]{1})).isEqualTo(-1);
    }

    @Test
    public void givenADistanceOfOneAndASecondShouldReturnZero() {
        assertThat(sut.solution(1, new int[]{1})).isEqualTo(0);
    }

    @Test
    public void givenADistanceOfTwoAndTwoSecondsShouldReturnTwo() {
        assertThat(sut.solution(2, new int[]{2, 1})).isEqualTo(1);
    }

    @Test
    public void givenADistanceOfOneAndTwoSecondsShouldReturnOne() {
        assertThat(sut.solution(1, new int[]{2, 1})).isEqualTo(1);
    }

    @Test
    public void givenADistanceOfFiveAndSevenSecondsShouldReturnTheFirstSecondRiverIsTraversable() {
        assertThat(sut.solution(5, new int[]{1,3,1,4,2,3,5,4})).isEqualTo(6);
    }

}
