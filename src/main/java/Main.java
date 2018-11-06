import board.ChessBoard;
import manage.GameInputManager;
import manage.GameManager;
import manage.GameValidator;

public class Main {
	public static void main(String [] args) {
		ChessBoard chessBoard = new ChessBoard();
		GameInputManager gameInputManager = new GameInputManager();
		GameValidator gameValidator = new GameValidator();
		GameManager manager = new GameManager(chessBoard, gameInputManager, gameValidator);
		manager.startGame();
	}

}
