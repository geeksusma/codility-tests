package es.martagon.brackets;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class BracketsTest {


	private Brackets brackets;

	@Before
	public void setUp() {
		brackets = new Brackets();
	}
	
	@Test
	public void should_expected_when_nested() {
		//given
		final String S="{[()()]}";
		final int expected = 1; 
		
		//when
		int solution = brackets.solution(S);
		
		//then
		assertThat(solution).isEqualTo(expected);
	}

	@Test
	public void should_expected_when_emptyNested() {
		//given
		final String S="";
		final int expected = 1; 
		
		//when
		int solution = brackets.solution(S);
		
		//then
		assertThat(solution).isEqualTo(expected);
	}


	@Test
	public void should_expected_when_withoutTokenNested() {
		//given
		final String S="asdfasdf";
		final int expected = 1; 
		
		//when
		int solution = brackets.solution(S);
		
		//then
		assertThat(solution).isEqualTo(expected);
	}


	@Test
	public void should_expected_when_noNested() {
		//given
		final String S="([)()]";
		final int expected = 0; 
		
		//when
		int solution = brackets.solution(S);
		
		//then
		assertThat(solution).isEqualTo(expected);
	}
	

	@Test
	public void should_expected_when_noNestedWhenStackIsEmpty() {
		//given
		final String S=")(";
		final int expected = 0; 
		
		//when
		int solution = brackets.solution(S);
		
		//then
		assertThat(solution).isEqualTo(expected);
	}
}
