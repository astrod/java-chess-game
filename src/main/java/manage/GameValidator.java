package manage;

import java.util.ArrayList;
import java.util.List;

public class GameValidator {

	private static final String EXIT_CODE = "x";
	private static final String DELIMITER = ",";

	public GameInput findGameStatusByInput(String input) {

		String [] token = input.split(DELIMITER);

		if(token.length > 2 || token.length == 0) {
			return new GameInput(GameStatus.INVALID, null);
		}

		if(token.length == 1 && token[0].equals(EXIT_CODE)) {
			return new GameInput(GameStatus.EXITED, null);
		}

		List<Integer> list = new ArrayList<>();
		for(String each : token) {
			try {
				list.add(Integer.parseInt(each));
			} catch (NumberFormatException ex) {
				return new GameInput(GameStatus.INVALID, null);
			}
		}

		return new GameInput(GameStatus.CONTINUE, new GameGridPos(list.get(0), list.get(1));
	}
}
