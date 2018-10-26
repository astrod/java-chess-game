package manage;

import board.ChessBoard;

import java.util.Scanner;

public class GameManager {

	private ChessBoard chessBoard;
	private GameInputManager gameInputManager;

	public GameManager(ChessBoard chessBoard, GameInputManager gameInputManager) {
		this.chessBoard = chessBoard;
		this.gameInputManager = gameInputManager;
	}

	public void startGame() {

		while(true) {
			chessBoard.display();
			String input = gameInputManager.getInput(chessBoard);
			GameValidator validator = new GameValidator();
			GameStatus status = validator.findGameStatusByInput(input);


		}
	}


}
