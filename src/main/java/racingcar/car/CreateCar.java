package racingcar.car;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class CreateCar {
    String[] carsName;

    public List<Car> inputCarName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

        try {
            carsName = carNameCheck(readLine().split(","));
            return createCar();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("애플리케이션을 종료합니다.");
            throw e;
        }
    }

    public String[] carNameCheck(String[] carsName) throws IllegalArgumentException {
        if (carsName.length < 2)
            throw new IllegalArgumentException("최소 2개의 자동차가 참여해야 합니다.");

        for (String carName : carsName){
            if (carName.length() > 5) {
                throw new IllegalArgumentException("자동차 이름의 길이는 5자 이하만 가능합니다.");
            }
            if (carName.equals(" ")) throw new IllegalArgumentException("자동차 이름은 공백이 될 수 없습니다.");
        }

        return carsName;
    }

    public List<Car> createCar() {
        List<Car> cars = new ArrayList<>();

        for (String carName : carsName) {
            int randomNumber = pickNumberInRange(0, 2);

            switch (randomNumber) {
                case 0:
                    cars.add(new SmallCar(carName));
                    break;
                case 1:
                       cars.add(new MediumCar(carName));
                       break;
                case 2:
                    cars.add(new LargeCar(carName));
            }
        }

        return cars;
    }
}
