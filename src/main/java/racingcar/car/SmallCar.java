package racingcar.car;

public class SmallCar implements Car {
    private final String name;
    private int position = 0;

    public SmallCar(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        this.position++;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPosition() {
        return position;
    }
}
