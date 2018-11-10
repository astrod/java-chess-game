package piece;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * PieceGroup
 *
 * @author jongUn
 * @since 2018. 11. 10.
 */
public class PieceGroup {

	private List<Piece> pieceList;

	public PieceGroup() {
		pieceList = new ArrayList<>();
		pieceList.addAll(makePawn());
	}

	private Collection<? extends Piece> makePawn() {
		return null;
	}

	public List<Piece> getPieceList() {
		return pieceList;
	}
}
