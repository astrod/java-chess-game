package manage;

public class GameInput {

	private GameStatus gameStatus;
	private GameGridPos gameGridPos;

	public GameInput(GameStatus gameStatus, GameGridPos gameGridPos) {
		this.gameStatus = gameStatus;
		this.gameGridPos = gameGridPos;
	}

	public GameStatus getGameStatus() {
		return gameStatus;
	}

	public GameGridPos getGameGridPos() {
		return gameGridPos;
	}
}
