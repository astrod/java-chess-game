package piece;

import board.ChessBoard;

import java.util.Objects;

public class GridPos {

	private int xPos;
	private int yPos;

	public GridPos(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}

	public boolean isWhite() {
		if(xPos % 2 == 1 && yPos % 2 == 1) {
			return true;
		}

		if(xPos % 2 == 0 && yPos % 2 == 0) {
			return true;
		}

		return false;
	}

	public boolean isBlack() {
		if(xPos % 2 == 0 && yPos % 2 == 1) {
			return true;
		}

		if(xPos % 2 == 1 && yPos % 2 == 0) {
			return true;
		}

		return false;
	}

	public boolean isSentinel() {
		return xPos == ChessBoard.START_POS || yPos == ChessBoard.START_POS || xPos == ChessBoard.END_POS || yPos == ChessBoard.END_POS;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		GridPos gridPos = (GridPos)o;
		return xPos == gridPos.xPos &&
			yPos == gridPos.yPos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(xPos, yPos);
	}
}
