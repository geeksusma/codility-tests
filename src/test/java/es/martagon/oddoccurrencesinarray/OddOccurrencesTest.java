package es.martagon.oddoccurrencesinarray;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class OddOccurrencesTest {

    private OddOccurrences oddOccurrences;

    @Before
    public void setUp() {
        oddOccurrences = new OddOccurrences();
    }

    @Test
    public void should_expected_when_all_items_repeat_once() {
        //given
        int[] values = {1,2,3,4,5,6,8,9,0,9,8,7,6,5,4,3,2,1};
        int expected = 0;

        //when
        final int solution = oddOccurrences.solution(values);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_expected_when_repeat_multiple_times() {
        //given
        int[] values = {9,3,9,3,9,7,9};
        int expected = 7;

        //when
        final int solution = oddOccurrences.solution(values);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_return_item_when_array_size_is_one() {
        //given
        int[] values = {9};
        int expected = 9;

        //when
        final int solution = oddOccurrences.solution(values);

        //then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    public void should_last_less_than_17_seconds_for_big_size() {
        long mediumTime = timedPassedForSize(1000000);
        assertThat(mediumTime).isLessThan(TimeUnit.SECONDS.toMillis(17));
    }

    @Test
    public void should_last_less_than_3_seconds_for_medium_size() {
        long mediumTime = timedPassedForSize(10000);
        assertThat(mediumTime).isLessThan(TimeUnit.SECONDS.toMillis(3));
    }

    private long timedPassedForSize(int size) {
        int params[] = new int[size*2+1];
        Random random = new Random();
        for (int k = 0; k < size; k++) {
            int i = random.nextInt();
            params[k] = i;
            params[k+size] = i;
        }
        params[size * 2] = 1;
        //Returns current time in millis
        long timeMilli = System.currentTimeMillis();
        oddOccurrences.solution(params);
        long timeMilli2 = System.currentTimeMillis();
        return timeMilli2 - timeMilli;
    }

}
