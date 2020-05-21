package es.awayo.missinginteger;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

public class MissingIntegerTest {
    MissingInteger missingInteger;

    @Before
    public void setUp() {
        missingInteger = new MissingInteger();
    }

    @Test
    public void should_expected_when_basic_sample() {
        //given
        int params[] = {1, 3, 6, 4, 1, 2};
        int expected = 5;

        //when
        int solution = missingInteger.solution(params);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_expected_when_basic_sample_iteration() {
        //given
        int params[] = {1,3,2,4};
        int expected = 5;

        //when
        int solution = missingInteger.solution(params);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_expected_when_all_negatives() {
        //given
        int params[] = {-1,-3,-2,-4};
        int expected = 1;

        //when
        int solution = missingInteger.solution(params);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_expected_when_big_numbers() {
        //given
        int params[] = {1000000,9999999,99999998};
        int expected = 1;

        //when
        int solution = missingInteger.solution(params);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_expected_when_large_array() {
        //given
        int params[] = new int[100000];
        int expected = 99999;
        for (int i = 0; i < params.length; i++) {
            params[i] = i - 1;
        }
        //when
        int solution = missingInteger.solution(params);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_expected_when_large_array_with_even_negatives() {
        //given
        int params[] = new int[100000];
        int expected = 2;
        for (int i = 0; i < params.length; i++) {
            params[i] = i%2 == 0 ? i - 1 : -i;
        }
        //when
        int solution = missingInteger.solution(params);

        //then
        assertThat(solution).isEqualTo(expected);
    }
}