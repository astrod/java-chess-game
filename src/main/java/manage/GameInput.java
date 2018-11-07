package manage;

import piece.GridPos;

public class GameInput {

	private GameStatus gameStatus;
	private GridPos gridPos;

	public GameInput(GameStatus gameStatus, GridPos gridPos) {
		this.gameStatus = gameStatus;
		this.gridPos = gridPos;
	}

	public GameStatus getGameStatus() {
		return gameStatus;
	}

	public GridPos getGridPos() {
		return gridPos;
	}
}
