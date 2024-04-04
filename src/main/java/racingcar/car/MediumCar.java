package racingcar.car;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class MediumCar implements Car{
    private final String name;
    private int position = 0;

    public MediumCar(String name, int position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void move() {
        if (pickNumberInRange(0, 9) >= 4) this.position += 2;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
