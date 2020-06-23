package es.agustinventura.cyclicrotation;

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
    public void emptyArrayShouldReturnEmptyArray() {
        assertThat(sut.solution(new int[]{}, 0)).isEqualTo(new int[]{});
    }

    @Test
    public void zeroRotationsShouldReturnSameArray() {
        assertThat(sut.solution(new int[]{1, 2}, 0)).isEqualTo(new int[]{1, 2});
    }

    @Test
    public void oneRotationShouldReturnArrayShiftedRightOneTime() {
        assertThat(sut.solution(new int[]{0, 0, 0}, 1)).isEqualTo(new int[]{0, 0, 0});
    }

    @Test
    public void threeRotationsShouldReturnArrayShiftedRightThreeTimes() {
        assertThat(sut.solution(new int[]{3, 8, 9, 7, 6}, 3)).isEqualTo(new int[]{9, 7, 6, 3, 8});
    }

    @Test
    public void fourRotationsShouldReturnArrayShiftedRightFourTimes() {
        assertThat(sut.solution(new int[]{1, 2, 3, 4}, 4)).isEqualTo(new int[]{1, 2, 3, 4});
    }
}
