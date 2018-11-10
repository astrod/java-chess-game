package manage;

import board.ChessBoard;

public class GameManager {

	private ChessBoard chessBoard;
	private GameInputManager gameInputManager;

	public GameManager(ChessBoard chessBoard, GameInputManager gameInputManager) {
		this.chessBoard = chessBoard;
		this.gameInputManager = gameInputManager;
	}

	public boolean startGame() {

		while(true) {
			chessBoard.display();
			String input = gameInputManager.getInput(chessBoard);
			GameInput status = new GameInput(new Token(input));

			if(status.getGameStatus() == GameStatus.EXITED) {
				return true;
			}

			if(status.getGameStatus() == GameStatus.INVALID) {
				System.out.println("잘못된 값이 입력되었습니다. 다시 입력해 주세요.");
			}

			if(status.getGameStatus() == GameStatus.ENDED) {
				System.out.println("게임이 종료되었습니다.");
			}
		}
	}


}
