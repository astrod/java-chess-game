import board.BlankBoardPrinter;
import board.ChessBoard;
import manage.GameInputManager;
import manage.GameManager;
import manage.GameValidator;
import piece.ChessPieceManager;

import java.util.Arrays;

public class Main {
	public static void main(String [] args) {
		ChessPieceManager chessPieceManager = new ChessPieceManager(Arrays.asList());
		BlankBoardPrinter printer = new BlankBoardPrinter();
		ChessBoard chessBoard = new ChessBoard(chessPieceManager, printer);
		GameInputManager gameInputManager = new GameInputManager();
		GameValidator gameValidator = new GameValidator();
		GameManager manager = new GameManager(chessBoard, gameInputManager, gameValidator);
		manager.startGame();
	}

}
