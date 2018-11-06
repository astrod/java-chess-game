package manage;

import board.ChessBoard;

public class GameManager {

	private ChessBoard chessBoard;
	private GameInputManager gameInputManager;
	private GameValidator validator;

	public GameManager(ChessBoard chessBoard, GameInputManager gameInputManager, GameValidator validator) {
		this.chessBoard = chessBoard;
		this.gameInputManager = gameInputManager;
		this.validator = validator;
	}

	public boolean startGame() {

		while(true) {
			chessBoard.display();
			String input = gameInputManager.getInput(chessBoard);
			GameInput status = validator.findGameStatusByInput(input);

			if(status.getGameStatus() == GameStatus.EXITED) {
				return true;
			}
		}
	}


}
