package manage;

import board.ChessBoard;

import java.util.Scanner;

public class GameInputManager {

	public String getInput(ChessBoard chessBoard) {
		Scanner scan = new Scanner(System.in);
		System.out.println(chessBoard.getTurn() + "의 차례");
		System.out.println("말을 이동시키고 싶은 좌표를 1,2,3,4 처럼 입력하세요. 앞의 두 개는 현재 말의 위치, 뒤의 두 개는 이동할 장소입니다. 종료하고 싶으시면 -1 을 입력해 주세요.");

		return scan.nextLine();
	}
}
