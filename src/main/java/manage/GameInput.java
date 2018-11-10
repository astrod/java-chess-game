package manage;

import piece.GridPos;

public class GameInput {

	private Token token;

	public GameInput(Token token) {
		this.token = token;
	}

	public GameStatus getGameStatus() {
		if(token.isExitedToken()) {
			return GameStatus.EXITED;
		}

		if(token.isInvalidToken()) {
			return GameStatus.INVALID;
		}

		if(token.isExitedToken()) {
			return GameStatus.EXITED;
		}

		return GameStatus.CONTINUE;
	}

}
