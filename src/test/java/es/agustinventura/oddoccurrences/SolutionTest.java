package es.agustinventura.oddoccurrences;

import es.agustinventura.oddoccurrences.Solution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SolutionTest {

    Solution sut;

    @BeforeEach
    private void setUp() {
        sut = new Solution();
    }

    @Test
    public void emptyArrayShouldThrowException() {
        Exception expectedException = assertThrows(IllegalArgumentException.class, () -> sut.solution(new int[] {}));
        assertThat(expectedException).isNotNull();
    }

    @Test
    public void evenLengthArrayShouldThrowException() {
        Exception expectedException = assertThrows(IllegalArgumentException.class, () -> sut.solution(new int[] {1, 1}));
        assertThat(expectedException).isNotNull();
    }

    @Test
    public void shouldFindOddNumber() {
        assertThat(sut.solution(new int[]{9,3,9,3,9,7,9})).isEqualTo(7);
    }

}
