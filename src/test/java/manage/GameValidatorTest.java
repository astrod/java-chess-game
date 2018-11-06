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
}