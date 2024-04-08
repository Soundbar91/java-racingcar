package racingcar.racing;

import racingcar.car.Car;
import racingcar.car.CreateCar;
import racingcar.generateNumber.GenerateRandomNumber;

import java.util.ArrayList;
import java.util.List;

public class CarRacing {
    private final GenerateRandomNumber generateRandomNumber;
    private final CreateCar createCar;
    private final InsertCoin insertCoin;
    private final CarWinner carWinner;
    private List<Car> cars;

    public CarRacing(int randomNumberMin, int randomNumberMax, int randomNumberStandard) {
        generateRandomNumber = new GenerateRandomNumber(randomNumberMin, randomNumberMax, randomNumberStandard);
        createCar = new CreateCar();
        insertCoin = new InsertCoin();
        carWinner = new CarWinner();
        cars = new ArrayList<>();
    }

    public void startRacing() {
        cars = createCar.inputCarName();
        int gameTry = insertCoin.inputTryNumber();
        while (gameTry-- > 0) playGame();
        carWinner.findWinner(cars);
    }

    public void playGame() {
        System.out.println("실행 결과");
        for (Car car : cars) if(generateRandomNumber.randomNumber()) car.move();
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
}
