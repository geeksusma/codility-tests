package es.geeksusma.binarygaps;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class CountBinaryGapsTest {

    private CountBinaryGaps countBinaryGaps;

    @Before
    public void setUp() {
        countBinaryGaps = new CountBinaryGaps();
    }

    @Test
    public void should_returnZero_when_noGaps() {
        //given
        int valueAsInt = 4;


        //when
        int maxGap = countBinaryGaps.calculateMaxGap(valueAsInt);

        //then
        assertThat(maxGap).isEqualTo(0);
    }

    @Test
    public void should_returnOnlyGap_when_onlyOne() {
        //given
        int valueAsInt = 9;


        //when
        int maxGap = countBinaryGaps.calculateMaxGap(valueAsInt);

        //then
        assertThat(maxGap).isEqualTo(2);
    }

    @Test
    public void should_returnMaximum_when_moreThanOneGap() {
        //given
        int valueAsInt = 21025;


        //when
        int maxGap = countBinaryGaps.calculateMaxGap(valueAsInt);

        //then
        assertThat(maxGap).isEqualTo(4);
    }

    @Test
    public void should_excludeGap_when_itDoesNotEndWith1() {
        //given
        int valueAsInt = 20;


        //when
        int maxGap = countBinaryGaps.calculateMaxGap(valueAsInt);

        //then
        assertThat(maxGap).isEqualTo(1);
    }

}