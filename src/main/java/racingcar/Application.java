package racingcar;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        try {
            System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
            String[] carsName = carNameCheck(readLine().split(","));

            System.out.println("시도할 회수는 몇회인가요?");
            int gameTry = gameTryCheck(readLine());

            int[] carsDist = new int[carsName.length];
            System.out.println("실행 결과");
            while (gameTry-- > 0) {
                gamePlay(carsName, carsDist);
                gamePrint(carsName, carsDist);
            }

        } catch (IllegalAccessException e) {
            System.out.print("애플리케이션을 종료합니다.");
        }
    }

    public static String[] carNameCheck(String[] carsName) throws IllegalAccessException {
        if (carsName.length < 2)
            throw new IllegalAccessException("최소 2개의 자동차가 참여해야 합니다.");

        for (String carName : carsName){
            if (carName.length() > 5) {
                throw new IllegalAccessException("자동차 이름의 길이는 5자 이하만 가능합니다.");
            }
        }
        return carsName;
    }

    public static int gameTryCheck(String input) throws IllegalAccessException {
        try {
            int gameTry = Integer.parseInt(input);
            if (gameTry < 0) {
                throw new IllegalAccessException("시도 회수는 음수가 될 수 없습니다.");
            }
            return gameTry;
        } catch (NumberFormatException e) {
            throw new IllegalAccessException("숫자를 입력하세요.");
        }
    }

    public static void gamePlay(String[] carsName, int[] carsDist) {
        for (int i = 0; i < carsName.length; i++) {
            int random = pickNumberInRange(0, 9);
            if (random >= 4) carsDist[i]++;
        }
    }

    public static void gamePrint(String[] carsName, int[] carsDist) {
        for (int i = 0; i < carsName.length; i++) {
            System.out.print(carsName[i] + " : ");
            for (int j = 0; j < carsDist[i]; j++) System.out.print('-');
            System.out.println();
        }
        System.out.println();
    }
}
