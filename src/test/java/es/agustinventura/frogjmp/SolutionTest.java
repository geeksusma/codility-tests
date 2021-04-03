package es.agustinventura.frogjmp;


import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    Solution sut;

    @Before
    public void setUp() {
        sut = new Solution();
    }

    @Test(expected = IllegalArgumentException.class)
    public void endPointLowerThanStartingPointShouldThrowException() {
        sut.solution(10, 0, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void lessThanOneJumpDistanceShouldThrowException() {
        sut.solution(10, 20, 0);
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