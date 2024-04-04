package racingcar;

import racingcar.racing.CarRacing;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class Application {
    public static void main(String[] args) {
        CarRacing racing = new CarRacing();
        racing.startRacing();
    }
}
