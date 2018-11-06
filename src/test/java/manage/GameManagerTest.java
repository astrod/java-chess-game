package manage;

import board.ChessBoard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameManagerTest {

	private GameManager gameManager;

	@Before
	public void setUp() throws Exception {
		gameManager = new GameManager(new ChessBoard(), new GameInputManager());
	}

	@Test
	public void startGame() {
		// given

		// when
		gameManager.startGame();

		// then
	}
}