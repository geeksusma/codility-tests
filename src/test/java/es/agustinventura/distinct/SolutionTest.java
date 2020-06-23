package es.agustinventura.distinct;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution sut;

    @BeforeEach
    private void setUp() {
        this.sut = new Solution();
    }

    @Test
    public void givenNullArrayShouldReturnZero() {
        assertThat(sut.solution(null)).isEqualTo(0);
    }

    @Test
    public void givenEmptyArrayShouldReturnZero() {
        assertThat(sut.solution(new int[] {})).isEqualTo(0);
    }

    @Test
    public void givenOneElementArrayShouldReturnOne() {
        assertThat(sut.solution(new int[] {1})).isEqualTo(1);
    }

    @Test
    public void givenTwoUniqueElementsArrayShouldReturnOne() {
        assertThat(sut.solution(new int[] {1, 2})).isEqualTo(2);
    }

    @Test
    public void givenOneRepeteadElementsArrayShouldReturnOne() {
        assertThat(sut.solution(new int[] {1, 1})).isEqualTo(1);
    }
}
