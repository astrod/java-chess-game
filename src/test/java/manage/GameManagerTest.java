package manage;

import board.ChessBoard;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import piece.ChessPieceManager;

import static com.google.common.truth.Truth.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GameManagerTest {

	private static final String EXIT_INPUT = "x";
	private GameManager gameManager;

	@Mock
	private GameInputManager manager;
	@Spy
	private GameValidator gameValidator;
	@Spy
	private ChessBoard chessBoard;

	@Before
	public void setUp() {
		gameManager = new GameManager(chessBoard, manager, gameValidator);
	}

	@Test
	public void startGame_X를눌러종료한경우() {
		// given
		given(manager.getInput(any(ChessBoard.class))).willReturn("x");
		doNothing().when(chessBoard).display();

		// when
		boolean result = gameManager.startGame();

		// then
		assertThat(result).isTrue();
		verify(gameValidator, times(1)).findGameStatusByInput(EXIT_INPUT);
	}

	@Test
	public void startGame_이상한값이입력된경우() {
		// given
		given(manager.getInput(any(ChessBoard.class))).willReturn("aaaabbbbcccc");
		doNothing().when(chessBoard).display();

		// when
		boolean result = gameManager.startGame();

		// then
		assertThat(result).isTrue();
		verify(gameValidator, times(1)).findGameStatusByInput("aaaabbbbcccc");
	}


}