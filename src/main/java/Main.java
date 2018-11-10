import board.BlankBoardPrinter;
import board.ChessBoard;
import manage.GameInputManager;
import manage.GameManager;
import piece.manager.ChessPieceManager;
import piece.PieceGroup;

public class Main {
	public static void main(String [] args) {
		ChessPieceManager chessPieceManager = new ChessPieceManager(new PieceGroup());
		ChessBoard chessBoard = new ChessBoard(chessPieceManager, new BlankBoardPrinter());
		GameManager manager = new GameManager(chessBoard, new GameInputManager());
		manager.startGame();
	}
}
