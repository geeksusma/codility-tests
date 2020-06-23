package es.agustinventura.maxproductofthree;

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
    public void givenAThreeElementsArrayShouldReturnTheProductOfTheElements() {
        assertThat(sut.solution(new int[]{1,1,1})).isEqualTo(1);
    }

    @Test
    public void givenAFourElementsArrayShouldReturnTheProductOfTheBiggestThreeElements() {
        assertThat(sut.solution(new int[]{1,2,3,4})).isEqualTo(24);
    }

    @Test
    public void givenASixElementsArrayShouldReturnTheProductOfTheBiggestThreeElements() {
        assertThat(sut.solution(new int[]{-3,1,2,-2,5,6})).isEqualTo(60);
    }

    @Test
    public void givenASixNegativeElementsArrayShouldReturnTheProductOfTheBiggestThreeElements() {
        assertThat(sut.solution(new int[]{-3,-1,-2,-2,-5,-6})).isEqualTo(-4);
    }

    @Test
    public void givenASixNegativeAndPositiveElementsArrayShouldReturnTheProductOfTheBiggestThreeElements() {
        assertThat(sut.solution(new int[]{-30,-0,-1,2,5,6})).isEqualTo(180);
    }
}
