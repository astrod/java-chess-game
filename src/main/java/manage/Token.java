package manage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import piece.GridPos;

public class Token {

	private static final int EXIT_CODE = -1;
	private static final String DELIMITER = ",";

	private List<Integer> token;

	public Token(String input) {
		if(input == null || input.length() == 0) {
			token = new ArrayList<>();
			return;
		}

		try {
			this.token = Stream.of(input.split(DELIMITER)).map(Integer::parseInt).collect(Collectors.toList());
		} catch (NumberFormatException ex) {
			this.token = new ArrayList<>();
		}

	}

	public GridPos getDestGridPos() {
		return new GridPos(token.get(2), token.get(3));
	}

	public boolean isExitedToken() {
		return token.size() == 1 && token.get(0).equals(EXIT_CODE);
	}

	public boolean isInvalidToken() {
		if(isExitedToken()) {
			return false;
		}

		return token.size() != 4;
	}

	public GridPos getSrcGridPos() {
		return new GridPos(token.get(0), token.get(1));
	}
}
