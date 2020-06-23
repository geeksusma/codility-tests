package es.agustinventura.missinginteger;

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
    public void givenNullArrayShouldReturnOne() {
        assertThat(sut.solution(null)).isEqualTo(1);
    }

    @Test
    public void givenEmptyArrayShouldReturnOne() {
        assertThat(sut.solution(new int[] {})).isEqualTo(1);
    }

    @Test
    public void givenAOnePositionArrayContainingOneShouldReturnTwo() {
        assertThat(sut.solution(new int[] {1})).isEqualTo(2);
    }

    @Test
    public void givenAOnePositionArrayContainingMinusOneShouldReturnOne() {
        assertThat(sut.solution(new int[] {-1})).isEqualTo(1);
    }

    @Test
    public void givenATwoPositionArrayContainingTwoConsecutiveNegativeNumbersShouldReturnOne() {
        assertThat(sut.solution(new int[] {-1, -2})).isEqualTo(1);
    }

    @Test
    public void givenATwoPositionArrayContainingOneAndMinusOneShouldReturnOne() {
        assertThat(sut.solution(new int[] {-1, 1})).isEqualTo(2);
    }

    @Test
    public void givenATwoPositionArrayContainingNegativeAndPositiveNumbersShouldReturnOne() {
        assertThat(sut.solution(new int[] {-1, 2})).isEqualTo(1);
    }

    @Test
    public void givenATwoPositionArrayContainingTwoConsecutiveNumbersShouldBiggestOnePlusOne() {
        assertThat(sut.solution(new int[] {1, 2})).isEqualTo(3);
    }

    @Test
    public void givenATwoPositionArrayContainingTwoNonConsecutiveNumbersShouldSmallestOnePlusOne() {
        assertThat(sut.solution(new int[] {1, 3})).isEqualTo(2);
    }

    @Test
    public void givenASixPositionArrayWithoutFiveShouldFindIt() {
        assertThat(sut.solution(new int[] {1,3,6,4,1,2})).isEqualTo(5);
    }

    @Test
    public void givenAThreePositionArrayWithoutFourShouldReturnIt() {
        assertThat(sut.solution(new int[] {1,2,3})).isEqualTo(4);
    }
}
