package es.martagon.arrayrotation;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ArrayRotationTest {

    private ArrayRotation arrayRotation;

    @Before
    public void setUp() {
        arrayRotation = new ArrayRotation();
    }
    
    @Test
	public void should_expectedSame_when_isEmptyNoRotate() {
		//given
		final int [] emptyInput = {};
		final int moves =0;
		
		//when
		final int[] solution = arrayRotation.solution(emptyInput, moves);
		
		//then
		assertThat(solution).isEqualTo(emptyInput);
	}

    
    @Test
	public void should_expectedSame_when_isEmptyRotateOneTime() {
		//given
		final int [] emptyInput = {};
		final int moves =1;
		
		//when
		final int[] solution = arrayRotation.solution(emptyInput, moves);
		
		//then
		assertThat(solution).isEqualTo(emptyInput);
	}
    
    @Test
	public void should_expectedSame_when_isNotEmptyNoRotate() {
		//given
		final int [] toRotate = {1,2,3};
		final int moves =0;
		
		//when
		final int[] solution = arrayRotation.solution(toRotate, moves);
		
		//then
		assertThat(solution).isEqualTo(toRotate);
	}
    
    @Test
	public void should_expectedSame_when_rotateLength() {
		//given
		final int [] toRotate = {1,2,3};
		final int moves =toRotate.length;
		
		//when
		final int[] solution = arrayRotation.solution(toRotate, moves);
		
		//then
		assertThat(solution).isEqualTo(toRotate);
	}
    

    @Test
	public void should_expected_when_rotateOneTime() {
		//given
    	final int [] toRotate = {1,2,3};
		final int moves =1;
		final int [] expected = {3,1,2};
		
		//when
		final int[] solution = arrayRotation.solution(toRotate, moves);
		
		//then
		assertThat(solution).isEqualTo(expected);
	}
    

    @Test
	public void should_expected_when_rotateOneMoreToLength() {
		//given
    	final int [] toRotate = {1,2,3};
		final int moves =toRotate.length+1;
		final int [] expected = {3,1,2};
		
		//when
		final int[] solution = arrayRotation.solution(toRotate, moves);
		
		//then
		assertThat(solution).isEqualTo(expected);
	}
}
