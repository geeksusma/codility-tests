package es.geeksusma.brackets;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class BracketsTest {

    private Brackets brackets;

    @Before
    public void setUp() {
        brackets = new Brackets();
    }

    @Test
    public void should_ok_when_basicRightTest() {
        //given

        //when
        final int solution = brackets.solution("{[()()]}");

        //then
        assertThat(solution).isEqualTo(1);
    }

    @Test
    public void should_ko_when_basicWrongTest() {
        //given

        //when
        final int solution = brackets.solution("{[((()]}");

        //then
        assertThat(solution).isZero();
    }
}