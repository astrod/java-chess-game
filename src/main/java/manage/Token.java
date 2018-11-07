package manage;

import java.util.List;

public class Token {

	private static final String EXIT_CODE = "x";
	private static final String DELIMITER = ",";

	private List<String> token;

	public String [] getDestPos() {
		return new String[2](token[2], token[3]);
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
