package racingcar.car;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class SmallCar implements Car {
    private final String name;
    private int position = 0;

    public SmallCar(String name, int position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void move() {
        if (pickNumberInRange(0, 9) >= 4) this.position++;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
