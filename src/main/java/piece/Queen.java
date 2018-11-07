package piece;

public class Queen implements Piece{

	private PieceType type;
	private GridPos gridPos;

	public Queen(int x, int y) {
		type = PieceType.QUEEN;
		this.gridPos = new GridPos(x, y);
	}

	@Override
	public GridPos getGridPos() {
		return gridPos;
	}

	@Override
	public String getCode() {
		return type.getCode();
	}
}
