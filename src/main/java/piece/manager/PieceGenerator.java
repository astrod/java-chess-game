package piece.manager;

import java.util.List;

import piece.Piece;

/**
 * PieceGenerator
 *
 * @author jongUn
 * @since 2018. 11. 10.
 */
public interface PieceGenerator {

	List<Piece> getWhitePiece();
	List<Piece> getBlackPiece();
}
