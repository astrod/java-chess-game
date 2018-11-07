package manage;

import org.junit.Before;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class GameValidatorTest {

	private GameValidator validator;

	@Before
	public void setUp() {
		validator = new GameValidator();
	}

	@Test
	public void findGameStatusByInput_잘못된값이입력된경우() {
		// given

		// when
		GameInput result = validator.findGameStatusByInput("df");

		// then
		assertThat(result.getGameStatus()).isEqualTo(GameStatus.INVALID);
	}

	@Test
	public void findGameStatusByInput_종료조건입력됨() {
		// given

		// when
		GameInput result = validator.findGameStatusByInput("x");

		// then
		assertThat(result.getGameStatus()).isEqualTo(GameStatus.EXITED);
	}

	@Test
	public void findGameStatusByInput_이상한숫자값이입력됨() {
		// given

		// when
		GameInput result = validator.findGameStatusByInput("1,ㅁ");

		// then
		assertThat(result.getGameStatus()).isEqualTo(GameStatus.INVALID);
	}

	@Test
	public void findGameStatusByInput_정상적으로처리된경우() {
		// given

		// when
		GameInput result = validator.findGameStatusByInput("1,3");

		// then
		assertThat(result.getGameStatus()).isEqualTo(GameStatus.CONTINUE);
	}
}