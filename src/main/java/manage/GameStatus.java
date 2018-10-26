package manage;

public enum GameStatus {
	INVALID,
	EXITED,
	CONTINUE,
	ENDED;

	public boolean isEnded() {
		return this == ENDED;
	}

	public boolean isContinue() {
		return this == CONTINUE;
	}

	public boolean isExited() {
		return this == EXITED;
	}

	public boolean isInvalid() {
		return this == INVALID;
	}
}
