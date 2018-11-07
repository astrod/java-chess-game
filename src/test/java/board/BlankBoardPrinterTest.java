package board;

import piece.GridPos;
import org.junit.Before;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class BlankBoardPrinterTest {

	private BlankBoardPrinter printer;

	@Before
	public void setUp() {
		printer = new BlankBoardPrinter();
	}

	@Test
	public void print_센티넬출력함() {
		// given

		// when
		String result = printer.print(new GridPos(0, 1));

		// then
		assertThat(result).isEqualTo("");
	}

	@Test
	public void print_흑색출력() {
		// given

		// when
		String result = printer.print(new GridPos(4, 3));

		// then
		assertThat(result).isEqualTo(printer.BLACK_SQUARE);
	}

	@Test
	public void print_백색출력() {
		// given

		// when
		String result = printer.print(new GridPos(6, 8));

		// then
		assertThat(result).isEqualTo(printer.WHITE_SQUARE);
	}
}