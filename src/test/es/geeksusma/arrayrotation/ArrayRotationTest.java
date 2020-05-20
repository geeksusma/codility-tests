package geeksusma.arrayrotation;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class ArrayRotationTest {

    private ArrayRotation arrayRotation;

    @Before
    public void setUp() {
        arrayRotation = new ArrayRotation();
    }

    @Test
    public void should_expected_when_rotateOneTime() {
        //given
        int[] toRotate = {3,8,9,7,6};
        int times = 1;
        int[] expected = {6,3,8,9,7};

        //when
        final int[] solution = arrayRotation.solution(toRotate, times);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_expected_when_rotateTwoTimes() {
        //given
        int[] toRotate = {3,8,9,7,6};
        int times = 2;
        int[] expected = {7,6,3,8,9};

        //when
        final int[] solution = arrayRotation.solution(toRotate, times);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_expected_when_rotateThreeTimes() {
        //given
        int[] toRotate = {3,8,9,7,6};
        int times = 3;
        int[] expected = {9,7,6,3,8};

        //when
        final int[] solution = arrayRotation.solution(toRotate, times);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_expected_when_rotateFourTimes() {
        //given
        int[] toRotate = {3,8,9,7,6};
        int times = 4;
        int[] expected = {8,9,7,6,3};

        //when
        final int[] solution = arrayRotation.solution(toRotate, times);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_expectedSameArray_when_rotateWhole() {
        //given
        int[] toRotate = {3,8,9,7,6};
        int times = 5;
        int[] expected = {3,8,9,7,6};

        //when
        final int[] solution = arrayRotation.solution(toRotate, times);

        //then
        assertThat(solution).isEqualTo(expected);
    }
}