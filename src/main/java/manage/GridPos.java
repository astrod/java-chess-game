package manage;

import java.util.Objects;

public class GridPos {

	private int xPos;
	private int yPos;

	public GridPos(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}

	public boolean isWhite() {
		return true;
	}

	public boolean isBlack() {
		return true;
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
