package es.awayo.frogriverone;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

public class FrogRiverTest {

    FrogRiver frogRiver;

    @Before
    public void setUp() {
        frogRiver = new FrogRiver();
    }

    @Test
    public void should_expected_when_sample_data() {
        //given
        int X = 5;
        int A[] = {1,3,1,4,2,3,5,4};
        int expected = 6;
        //when
        int solution = frogRiver.solution(X,A);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_expected_when_large_data() {
        //given
        int X = 2;
        int A[] = new int[100000];
        for (int i = 0; i < 99999; i++) {
            A[i] = 1;
        }
        A[99999] = 2;
        int expected = 99999;
        //when
        int solution = frogRiver.solution(X,A);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_expected_when_no_solution() {
        //given
        int X = 3;
        int A[] = new int[100000];
        for (int i = 0; i < 99999; i++) {
            A[i] = 1;
        }
        A[99999] = 2;
        int expected = -1;
        //when
        int solution = frogRiver.solution(X,A);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_expected_when_gaps() {
        //given
        int X = 3;
        int A[] =  {1, 3};
        int expected = -1;
        //when
        int solution = frogRiver.solution(X,A);

        //then
        assertThat(solution).isEqualTo(expected);
    }
}