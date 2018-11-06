package piece;

import manage.GridPos;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;

public class ChessPieceManagerTest {

	private ChessPieceManager manager;

	@Before
	public void setUp() {
		List<Piece> pieceList = makePieceList();
		manager = new ChessPieceManager(pieceList);
	}

	private List<Piece> makePieceList() {
		List<Piece> result = new ArrayList<>();

		for(int i = 0; i<10; i++) {
			Piece piece = new Queen(i, i+1);
			result.add(piece);
		}

		return result;
	}

	@Test
	public void findPieceByGridPos_입력한값이없는경우() {
		// given

		// when
		Piece result = manager.findPieceByGridPos(new GridPos(100, 100));

		// then
		assertThat(result).isNull();
	}

	@Test
	public void findPieceByGridPos_입력한값이존재함() {
		// given

		// when
		Piece result = manager.findPieceByGridPos(new GridPos(0, 1));

		// then
		assertThat(result.getGridPos()).isEqualTo(new GridPos(0, 1));
	}
}