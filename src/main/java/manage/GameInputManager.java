package manage;

import board.ChessBoard;

import java.util.Scanner;

public class GameInputManager {

	public String getInput(ChessBoard chessBoard) {
		Scanner scan = new Scanner(System.in);
		System.out.println(chessBoard.getTurn() + "의 차례");
		System.out.println("말을 이동시키고 싶은 좌표를 (1,2) 처럼 입력하세요. 종료하고 싶으시면 x 를 눌러주세요.");

		return scan.nextLine();
	}
}
