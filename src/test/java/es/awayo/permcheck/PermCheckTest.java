package es.awayo.permcheck;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PermCheckTest {

    PermCheck permCheck;

    @Before
    public void setUp() {
        permCheck = new PermCheck();
    }

    @Test
    public void should_return_0_when_repeated_value() {
        //given
        int A[] = {4,1,1,2,3};
        int expected = 0;

        //when
        int solution = permCheck.solution(A);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_return_0_when_value_higher_than_array_size() {
        //given
        int A[] = {1,4,2,3,10};
        int expected = 0;

        //when
        int solution = permCheck.solution(A);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_expected_when_valid_sample_data() {
        //given
        int A[] = {4,1,3,2};
        int expected = 1;

        //when
        int solution = permCheck.solution(A);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_expected_when_invalid_sample_data() {
        //given
        int A[] = {4,1,2};
        int expected = 0;

        //when
        int solution = permCheck.solution(A);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_expected_when_medium_size_data() {
        //given
        int A[] = generatePerm(10000);
        int expected = 1;

        //when
        int solution = permCheck.solution(A);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_expected_when_large_size_data() {
        //given
        int A[] = generatePerm(100000);
        int expected = 1;

        //when
        int solution = permCheck.solution(A);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_expected_when_Ak_contains_large_integer() {
        //given
        int A[] = generatePerm(100000);
        A[9999] = 1000000000;
        int expected = 0;

        //when
        int solution = permCheck.solution(A);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    private int[] generatePerm(int length) {
        ArrayList<Integer> dummyList = new ArrayList<Integer>();
        for (int i = 1; i <= length; i++) {
            dummyList.add(i);
        }

        Collections.shuffle(dummyList);

        int[] permutation = new int[length];
        for (int i = 0; i < length; i++) {
            permutation[i] = dummyList.get(i);
        }
        return permutation;
    }
}