package manage;

import board.ChessBoard;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import static com.google.common.truth.Truth.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doNothing;

@RunWith(MockitoJUnitRunner.class)
public class GameManagerTest {

	private static final String EXIT_INPUT = "-1";
	private GameManager gameManager;

	@Mock
	private GameInputManager manager;
	@Spy
	private ChessBoard chessBoard;

	@Before
	public void setUp() {
		gameManager = new GameManager(chessBoard, manager);
	}

	@Test
	public void startGame_종료값이입력된경우() {
		// given
		given(manager.getInput(any(ChessBoard.class))).willReturn(EXIT_INPUT);
		doNothing().when(chessBoard).display();

		// when
		boolean result = gameManager.startGame();

		// then
		assertThat(result).isTrue();
	}
}