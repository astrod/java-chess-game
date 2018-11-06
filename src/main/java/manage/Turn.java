package manage;

public enum Turn {
	BLACK("black"),
	WHITE("white");

	private final String code;

	Turn(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
}
