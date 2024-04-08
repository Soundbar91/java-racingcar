package racingcar.racing;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InsertCoin {

    public int inputTryNumber() {
        try {
            System.out.println("시도할 회수는 몇회인가요?");
            return gameTryCheck(readLine());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("애플리케이션을 종료합니다.");
            throw e;
        }
    }

    private int gameTryCheck(String input) throws IllegalArgumentException {
        try {
            int coin = Integer.parseInt(input);
            if (coin <= 0) throw new IllegalArgumentException("시도 회수는 1 이상입니다.");

            return coin;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자를 입력하세요.");
        }
    }
}
