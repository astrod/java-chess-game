package manage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

/**
 * GameInputTest
 *
 * @author jongUn
 * @since 2018. 11. 10.
 */
public class GameInputTest {

	private GameInput gameInput;

	@After
	public void tearDown() {
		gameInput = null;
	}

	@Test
	public void findGameStatusByInput_잘못된값이입력된경우() {
		// given
		gameInput = new GameInput(new Token("1,2"));

		// when
		GameStatus result = gameInput.getGameStatus();

		// then
		assertThat(result).isEqualTo(GameStatus.INVALID);
	}

	@Test
	public void findGameStatusByInput_종료조건입력됨() {
		// given
		gameInput = new GameInput(new Token("-1"));

		// when
		GameStatus result = gameInput.getGameStatus();

		// then
		assertThat(result).isEqualTo(GameStatus.EXITED);
	}

	@Test
	public void findGameStatusByInput_이상한숫자값이입력됨() {
		// given
		gameInput = new GameInput(new Token("1,ㅁ"));

		// when
		GameStatus result = gameInput.getGameStatus();

		// then
		assertThat(result).isEqualTo(GameStatus.INVALID);
	}

	@Test
	public void findGameStatusByInput_정상적으로처리된경우() {
		// given
		gameInput = new GameInput(new Token("1,2,3,4"));

		// when
		GameStatus result = gameInput.getGameStatus();

		// then
		assertThat(result).isEqualTo(GameStatus.CONTINUE);
	}
}