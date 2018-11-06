package piece;

import manage.GridPos;

public class Queen implements Piece{

	private GridPos gridPos;

	public Queen(int x, int y) {
		this.gridPos = new GridPos(x, y);
	}

	@Override
	public GridPos getGridPos() {
		return gridPos;
	}
}
