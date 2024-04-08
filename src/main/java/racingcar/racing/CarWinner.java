package racingcar.racing;

import racingcar.car.Car;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.max;

public class CarWinner {
    private List<Car> winner = new ArrayList<>();
    private int maxDist = Integer.MIN_VALUE;

    public void findWinner(List<Car> cars) {
        findMaxDist(cars);
        searchWinner(cars);
        printWinner();
    }

    private void findMaxDist(List<Car> cars) {
        for (Car car : cars) maxDist = max(maxDist, car.getPosition());
    }

    private void searchWinner(List<Car> cars) {
        for (Car car : cars) if (car.getPosition() == maxDist) winner.add(car);
    }

    private void printWinner() {
        System.out.print("최종 우승자 : ");

        System.out.print(winner.get(0).getName());
        for (int i = 1; i < winner.size(); i++) {
            System.out.print(", " + winner.get(i).getName());
        }
    }
}
