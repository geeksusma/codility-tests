package es.awayo.maxcounters;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class MaxCounterTest {

    MaxCounter maxCounter;

    @Before
    public void setUp() {
        maxCounter = spy(new MaxCounter());
    }

    @Test
    public void should_expected_when_A_is_empty() {
        //given
        int A[] = {};
        int N = 1;
        int expected[] = {0};

        //when
        int solution[] = maxCounter.solution(N, A);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_increase_row_when_Ai_is_that_counter() {
        //given
        int A[] = {1};
        int N = 4;
        int expected[] = {1,0,0,0};

        //when
        int solution[] = maxCounter.solution(N, A);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_fill_with_max_value_all_rows_when_Ai_is_N_plus_1() {
        //given
        int A[] = {1,5};
        int N = 4;
        int expected[] = {1,1,1,1};

        //when
        int solution[] = maxCounter.solution(N, A);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_expected_when_sample_data() {
        //given
        int A[] = {3,4,4,6,1,4,4};
        int N = 5;
        int expected[] = {3,2,2,4,2};

        //when
        int solution[] = maxCounter.solution(N, A);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_expected_when_Ai_is_N_plus_1_ever() {
        //given
        int A[] = {6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6};
        int N = 5;
        int expected[] = {0,0,0,0,0};

        //when
        int solution[] = maxCounter.solution(N, A);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_call_fillAdd_once_when_Ai_is_N_plus_1_ever() {
        //given
        int A[] = {6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6};
        int N = 5;
        int expected[] = {0,0,0,0,0};

        //when
        int solution[] = maxCounter.solution(N, A);

        //then
        verify(maxCounter).fillAll(any(int[].class), anyInt());
    }
}