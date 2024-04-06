package racingcar.car;

public class MediumCar extends Car {
    public MediumCar(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        this.position += 2;
    }
}
