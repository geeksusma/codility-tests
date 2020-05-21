package es.geeksusma.frogjumps;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class FrogJumpsTest {

    private FrogJumps frogJumps;

    @Before
    public void setUp() {
        frogJumps = new FrogJumps();
    }

    @Test
    public void should_calculateJumps_when_frogJumps() {

        //when
        final int solution = frogJumps.solution(10, 80, 30);

        //then
        assertThat(solution).isEqualTo(3);
    }
}