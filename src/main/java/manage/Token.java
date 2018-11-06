package manage;

public class Token {

	private static final String EXIT_CODE = "x";
	private static final String DELIMITER = ",";

	private String [] token;

	public String[] getToken() {
		return token;
	}

	public Token(String input) {
		this.token = input.split(DELIMITER);
	}

	public boolean isExitedToken() {
		return token.length == 1 && token[0].equals(EXIT_CODE);
	}

	public boolean isInvalidToken() {
		return token.length > 2 || token.length == 0;
	}


}
