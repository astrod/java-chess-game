package manage;

import org.junit.Test;
import piece.GridPos;

import static com.google.common.truth.Truth.assertThat;

public class GridPosTest {

	@Test
	public void isWhite_좌표가둘다홀수() {
		// given
		GridPos gridPos = new GridPos(1, 7);

		// when
		boolean result = gridPos.isWhite();

		// then
		assertThat(result).isTrue();
	}

	@Test
	public void isWhite_좌표가둘다짝수() {
		// given
		GridPos gridPos = new GridPos(2, 6);

		// when
		boolean result = gridPos.isWhite();

		// then
		assertThat(result).isTrue();
	}

	@Test
	public void isBlack_x짝수y홀수() {
		// given
		GridPos gridPos = new GridPos(2, 5);

		// when
		boolean result = gridPos.isBlack();

		// then
		assertThat(result).isTrue();
	}

	@Test
	public void isBlack_x홀수y짝수() {
		// given
		GridPos gridPos = new GridPos(1, 8);

		// when
		boolean result = gridPos.isBlack();

		// then
		assertThat(result).isTrue();
	}
}