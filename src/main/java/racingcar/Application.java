package racingcar;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        try {
            System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
            String[] carsName = carNameCheck(readLine().split(","));

            System.out.println("시도할 회수는 몇회인가요?");
            int gameTry = Integer.parseInt(readLine());

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
}
