package racingcar.racing;

import racingcar.car.Car;
import racingcar.car.CreateCar;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;
import static java.lang.Math.max;

public class CarRacing {
    private List<Car> cars = new ArrayList<>();
    private List<Car> winner = new ArrayList<>();
    private CreateCar createCar = new CreateCar();
    private int maxDist = -1;

    public void startRacing() {
        createCar.inputCarName();
        int T = inputTryNumber();
        while (T-- > 0) playGame();
        findMaxDist();
        findWinner();
        printWinner();
    }

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

    public int gameTryCheck(String input) throws IllegalArgumentException {
        try {
            int gameTry = Integer.parseInt(input);
            if (gameTry < 0) throw new IllegalArgumentException("시도 회수는 음수가 될 수 없습니다.");

            return gameTry;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자를 입력하세요.");
        }
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
            System.out.print(car.getName() + " : ");
            System.out.print("-".repeat(car.getPosition()));
            System.out.println();
        }
        System.out.println();
    }

    public boolean randomNumber() {
        return pickNumberInRange(0, 9) >= 4;
    }

    public void findMaxDist() {
        for (Car car : cars) maxDist = max(maxDist, car.getPosition());
    }

    public void findWinner() {
        for (Car car : cars) if (car.getPosition() == maxDist) winner.add(car);
    }

    public void printWinner() {
        System.out.print("최종 우승자 : ");

        System.out.print(winner.get(0).getName());
        for (int i = 1; i < winner.size(); i++) {
            System.out.print(", " + winner.get(i).getName());
        }
    }
}
