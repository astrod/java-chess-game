package piece;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChessPieceManager {

	private List<Piece> pieceList;
	private Map<GridPos, Piece> pieceMap;

	public ChessPieceManager(List<Piece> pieceList) {
		this.pieceList = pieceList;
		this.pieceMap = initializeMap();
	}

	private Map<GridPos, Piece> initializeMap() {

		Map<GridPos, Piece> result = new HashMap<>();

		for(Piece each : pieceList) {
			result.put(each.getGridPos(), each);
		}

		return result;
	}

	public Piece findPieceByGridPos(GridPos gridPos) {
		return pieceMap.get(gridPos);
	}
}
