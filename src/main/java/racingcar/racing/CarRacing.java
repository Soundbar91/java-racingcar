package racingcar.racing;

import racingcar.car.Car;
import racingcar.car.CreateCar;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;
import static java.lang.Math.max;

public class CarRacing {
    private static final int randomNumberMin = 0;
    private static final int randomNumberMax = 9;
    private static final int randomNumberStandard = 4;

    private List<Car> cars = new ArrayList<>();
    private CreateCar createCar = new CreateCar();
    private InsertCoin insertCoin = new InsertCoin();
    private CarWinner carWinner = new CarWinner();

    public void startRacing() {
        cars = createCar.inputCarName();
        int gameTry = insertCoin.inputTryNumber();
        while (gameTry-- > 0) playGame();
        carWinner.findWinner(cars);
    }

    public void playGame() {
        System.out.println("실행 결과");
        for (Car car : cars) {
            if(randomNumber()) car.move();
        }
        gamePrint();
    }

    public void gamePrint() {
        for (Car car : cars) {
//            System.out.print(car.getName() + "(" + car.getClass().getSimpleName() + ")" + " : ");
            System.out.print(car.getName() + " : ");
            System.out.print("-".repeat(car.getPosition()));
            System.out.println();
        }
        System.out.println();
    }

    public boolean randomNumber() {
        return pickNumberInRange(randomNumberMin, randomNumberMax) >= randomNumberStandard;
    }
}
