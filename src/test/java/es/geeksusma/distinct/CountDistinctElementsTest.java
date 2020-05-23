package es.geeksusma.distinct;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class CountDistinctElementsTest {

    private CountDistinctElements countDistinctElements;

    @Before
    public void setUp() {
        countDistinctElements = new CountDistinctElements();
    }

    @Test
    public void should_returnOnlyDistincts_when_arrayHasDistincts() {
        //given
        int[] elements = {2, 1, 1, 2, 3, 1};


        //when
        final int solution = countDistinctElements.solution(elements);
        //then
        assertThat(solution).isEqualTo(3);
    }

    @Test
    public void should_returnZero_when_arrayIsEmpty() {
        //given
        int[] elements = {};


        //when
        final int solution = countDistinctElements.solution(elements);
        //then
        assertThat(solution).isZero();
    }
}