package board;

import manage.GridPos;
import manage.Turn;
import piece.ChessPieceManager;
import piece.Piece;

public class ChessBoard {

	private static final int START_POS = 0;
	private static final int END_POS = 10;
	private ChessPieceManager chessPieceManager;
	private BlankBoardPrinter blankBoardPrinter;

	public ChessBoard(ChessPieceManager chessPieceManager, BlankBoardPrinter blankBoardPrinter) {
		this.chessPieceManager = chessPieceManager;
		this.blankBoardPrinter = blankBoardPrinter;
	}

	public String getTurn() {
		return Turn.BLACK.getCode();
	}

	public void display() {
		for(int i = START_POS; i< END_POS; i++) {
			for(int j = START_POS; j<END_POS; j++) {
				if(isSentinel(i, j)) {
					continue;
				}

				GridPos gridPos = new GridPos(i, j);
				Piece piece = chessPieceManager.findPieceByGridPos(gridPos);

				if(piece == null) {
					System.out.print(blankBoardPrinter.print(gridPos));
					continue;
				}

				System.out.print(piece.getCode());

			}
		}
	}

	private boolean isSentinel(int i, int j) {
		return i == START_POS || j == START_POS || i == END_POS || j == END_POS;
	}

}
