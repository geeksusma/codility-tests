package es.agustinventura.frogjmp;

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
    public void endPointLowerThanStartingPointShouldThrowException() {
        Exception expectedException = assertThrows(IllegalArgumentException.class, () -> sut.solution(10, 0, 10));
        assertThat(expectedException).isNotNull();
    }

    @Test
    public void lessThanOneJumpDistanceShouldThrowException() {
        Exception expectedException = assertThrows(IllegalArgumentException.class, () -> sut.solution(10, 20, 0));
        assertThat(expectedException).isNotNull();
    }

    @Test
    public void endPointEqualToStartPointShouldReturnZero() {
        assertThat(sut.solution(10, 10, 20)).isEqualTo(0);
    }

    @Test
    public void endLessThanJumpDistanceShouldReturnZero() {
        assertThat(sut.solution(10, 20, 20)).isEqualTo(0);
    }

    @Test
    public void fromTenToEightyFiveJumpingThirtyShouldBeThreeJumps() {
        assertThat(sut.solution(10, 85, 30)).isEqualTo(3);
    }

    @Test
    public void fromTenToFiftyJumpingTwentyShouldBeTwoJumps() {
        assertThat(sut.solution(10, 50, 20)).isEqualTo(2);
    }
}