package manage;

import org.junit.Before;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assertWithMessage;
import static com.google.common.truth.Truth.assert_;



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
		GameStatus result = validator.findGameStatusByInput("df");

		// then
		assertThat(result).isEqualTo(GameStatus.INVALID);
	}

	@Test
	public void findGameStatusByInput_종료조건입력됨() {
		// given

		// when
		GameStatus result = validator.findGameStatusByInput("x");

		// then
		assertThat(result).isEqualTo(GameStatus.EXITED);
	}

	@Test
	public void findGameStatusByInput_게임이끝남() {
		// given

		// when
		GameStatus result = validator.findGameStatusByInput("1,2");

		// then
		assertThat(result).isEqualTo(GameStatus.ENDED);
	}
}