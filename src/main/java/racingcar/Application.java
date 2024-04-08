package racingcar;

import racingcar.racing.CarRacing;

public class Application {
    public static void main(String[] args) {
        CarRacing racing = new CarRacing(0, 9 ,4);
        racing.startRacing();
    }
}
