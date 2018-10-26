import board.ChessBoard;
import manage.GameInputManager;
import manage.GameManager;

public class Main {
	public static void main(String [] args) {
		ChessBoard chessBoard = new ChessBoard();
		GameInputManager gameInputManager = new GameInputManager();
		GameManager manager = new GameManager(chessBoard, gameInputManager);
		manager.startGame();
	}

}
