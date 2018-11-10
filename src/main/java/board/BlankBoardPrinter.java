package board;

import piece.GridPos;

public class BlankBoardPrinter {

	protected static final String BLACK_SQUARE = "□";
	protected static final String WHITE_SQUARE = "■";

	public String print(GridPos pos) {

		if(pos.isSentinel()) {
			return "";
		}

		if(pos.isBlack()) {
			return BLACK_SQUARE;
		}

		if(pos.isWhite()) {
			return WHITE_SQUARE;
		}



		return null;
	}
}
