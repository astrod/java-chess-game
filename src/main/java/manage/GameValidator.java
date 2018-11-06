package manage;

import java.util.ArrayList;
import java.util.List;

public class GameValidator {



	public GameInput findGameStatusByInput(String input) {

		Token token = new Token(input);

		if(token.isInvalidToken()) {
			return new GameInput(GameStatus.INVALID, null);
		}

		if(token.isExitedToken()) {
			return new GameInput(GameStatus.EXITED, null);
		}

		List<Integer> list = new ArrayList<>();
		for(String each : token.getToken()) {
			try {
				list.add(Integer.parseInt(each));
			} catch (NumberFormatException ex) {
				return new GameInput(GameStatus.INVALID, null);
			}
		}

		return new GameInput(GameStatus.CONTINUE, new GridPos(list.get(0), list.get(1)));
	}
}
