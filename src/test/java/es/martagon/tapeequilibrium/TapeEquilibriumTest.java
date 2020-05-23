package es.martagon.tapeequilibrium;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TapeEquilibriumTest {
    private TapeEquilibrium tapeEquilibrium;
    private Random random;

    @Before
    public void setUp() {
        tapeEquilibrium = new TapeEquilibrium();
        random = new Random();
    }

    @Test
    public void should_expected_when_example_data() {
        //given
        int params[] = {3,1,2,4,3};
        int expected = 1;

        //when
        int solution = tapeEquilibrium.solution(params);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_return_accumulative_when_value_have_negatives() {
        //given
        int params[] = {9,-9};
        int expected = 18;

        //when
        int solution = tapeEquilibrium.solution(params);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_expected_when_right_side_0() {
        //given
        int params[] = {9, 0};
        int expected = 9;

        //when
        int solution = tapeEquilibrium.solution(params);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_expected_when_left_side_0() {
        //given
        int params[] = {0, 9};
        int expected = 9;

        //when
        int solution = tapeEquilibrium.solution(params);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_accumulate_when_size_grater_than_2_left_to_right() {
        //given
        int params[] = {1, 1, 3};
        int expected = 1;

        //when
        int solution = tapeEquilibrium.solution(params);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_accumulate_when_size_grater_than_2_right_to_left() {
        //given
        int params[] = {3, 1, 1};
        int expected = 1;

        //when
        int solution = tapeEquilibrium.solution(params);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_return_0_when_array_is_balanced() {
        //given
        int params[] = {-1,1,-1,1,-1,1,-1,1};
        int expected = 0;

        //when
        int solution = tapeEquilibrium.solution(params);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_return_when_max_min_values_are_present() {
        //given
        int randomPositiveInt = Math.abs(random.nextInt());
        int params[] = {-100000, 100000,-100000,100000,randomPositiveInt};
        int expected = randomPositiveInt;

        //when
        int solution = tapeEquilibrium.solution(params);

        //then
        assertThat(solution).isEqualTo(expected);
    }


}
