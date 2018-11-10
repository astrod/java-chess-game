package manage;

import org.junit.Before;
import org.junit.Test;

import piece.GridPos;

import static com.google.common.truth.Truth.assertThat;

public class TokenTest {

	private Token token;

	@Before
	public void setUp() {
		token = new Token("1,2,3,4");
	}

	@Test
	public void getDestGridPos_도착지점() {
		// given

		// when
		GridPos result = token.getDestGridPos();

		// then
		assertThat(result).isEqualTo(new GridPos(3,4));
	}

	@Test
	public void getSrcGridPos_시작지점() {
		// given

		// when
		GridPos result = token.getSrcGridPos();

		// then
		assertThat(result).isEqualTo(new GridPos(1,2));
	}

	@Test
	public void isExitedToken_토큰이null인경우() {
		// given
		Token token = new Token(null);

		// when
		boolean result = token.isExitedToken();

		// then
		assertThat(result).isFalse();
	}

	@Test
	public void isExitedToken_잘못된문자가들어온경우() {
		// given
		Token token = new Token("df");

		// when
		boolean result = token.isExitedToken();

		// then
		assertThat(result).isFalse();
	}

	@Test
	public void isExitedToken_종료문자가입력된경우() {
		// given
		Token token = new Token("x");

		// when
		boolean result = token.isExitedToken();

		// then
		assertThat(result).isFalse();
	}

	@Test
	public void isInvalidToken_구분자가잘못들어온경우() {
		// given
		Token token = new Token("1|2|3|4");

		// when
		boolean result = token.isInvalidToken();

		// then
		assertThat(result).isTrue();
	}

	@Test
	public void isInvalidToken_숫자가더많이들어온경우() {
		// given
		Token token = new Token("1,2,3,4,5,6,7");

		// when
		boolean result = token.isInvalidToken();

		// then
		assertThat(result).isTrue();
	}

	@Test
	public void isInvalidToken_숫자가더조금들어온경우() {
		// given
		Token token = new Token("1,2,3");

		// when
		boolean result = token.isInvalidToken();

		// then
		assertThat(result).isTrue();
	}

	@Test
	public void isInvalidToken_empty스트링이들어온경우() {
		// given
		Token token = new Token("");

		// when
		boolean result = token.isInvalidToken();

		// then
		assertThat(result).isTrue();
	}
}