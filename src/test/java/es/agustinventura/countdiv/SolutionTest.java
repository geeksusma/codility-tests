package es.agustinventura.countdiv;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution sut;

    @BeforeEach
    private void setUp() {
        sut = new Solution();
    }

    @Test
    public void givenStartGreaterThanEndShouldReturnZero() {
        assertThat(sut.solution(20,10, 3)).isEqualTo(0);
    }

    @Test
    public void givenStartEqualToEndShouldReturnZero() {
        assertThat(sut.solution(10,10, 3)).isEqualTo(0);
    }

    @Test
    public void givenLowerThanOneDivisorShouldReturnZero() {
        assertThat(sut.solution(10,20, -1)).isEqualTo(0);
    }

    @Test
    public void givenOneAsTheDivisorShouldReturnDifferenceBetweenStartAndEnd() {
        assertThat(sut.solution(10,20, 1)).isEqualTo(11);
    }

    @Test
    public void givenTwoAsTheDivisorShouldReturnDifferenceBetweenStartAndEndBetweenTwo() {
        assertThat(sut.solution(10,20, 2)).isEqualTo(6);
    }

    @Test
    public void givenTwoAsTheDivisorAndEvenElementsShouldReturnCeilOfDifferenceBetweenStartAndEndBetweenTwo() {
        assertThat(sut.solution(9,20, 2)).isEqualTo(6);
    }

    @Test
    public void givenThreeAsTheDivisorAndTenElementsShouldReturnThree() {
        assertThat(sut.solution(10, 20, 3)).isEqualTo(3);
    }

    @Test
    public void givenThreeAsTheDivisorAndElevenElementsShouldReturnThree() {
        assertThat(sut.solution(9, 20, 3)).isEqualTo(4);
    }

    @Test
    public void givenThreeAsTheDivisorAndTwelveElementsShouldReturnThree() {
        assertThat(sut.solution(8, 20, 3)).isEqualTo(4);
    }

    @Test
    public void givenTwoAsTheDivisorAndIntervalSixToElevenShouldReturnThree() {
        assertThat(sut.solution(6, 11, 2)).isEqualTo(3);
    }
}
