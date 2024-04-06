package racingcar.car;

public class LargeCar extends Car {
    public LargeCar(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        this.position += 4;
    }
}
