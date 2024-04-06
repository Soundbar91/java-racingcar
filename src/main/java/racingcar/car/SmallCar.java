package racingcar.car;

public class SmallCar extends Car {
    public SmallCar(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        this.position++;
    }
}
