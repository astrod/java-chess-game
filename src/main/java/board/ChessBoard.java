package board;

import piece.GridPos;
import manage.Turn;
import piece.manager.ChessPieceManager;
import piece.Piece;

public class ChessBoard {

	public static final int START_POS = 0;
	public static final int END_POS = 9;

	private ChessPieceManager chessPieceManager;
	private BlankBoardPrinter blankBoardPrinter;

	public ChessBoard() {
	}

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
				GridPos gridPos = new GridPos(i, j);

				if(gridPos.isSentinel()) {
					continue;
				}

				Piece piece = chessPieceManager.findPieceByGridPos(gridPos);

				if(piece == null) {
					System.out.print(blankBoardPrinter.print(gridPos));
					continue;
				}

				System.out.print(piece.getCode());
			}
			System.out.println();
		}
	}



}
