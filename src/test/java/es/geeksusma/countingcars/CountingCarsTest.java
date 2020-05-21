package es.geeksusma.countingcars;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class CountingCarsTest {

    private CountingCars countingCars;

    @Before
    public void setUp() {
        countingCars = new CountingCars();
    }

    @Test
    public void should_noCount_when_emptyRoad() {
        //given
        int[] road = {};

        //when
        final int solution = countingCars.solution(road);

        //then
        assertThat(solution).isZero();
    }

    @Test
    public void should_count5_when_roadHasVehicles() {
        //given
        int[] road = {0, 1, 0, 1, 1};

        //when
        final int solution = countingCars.solution(road);

        //then
        assertThat(solution).isEqualTo(5);
    }
}