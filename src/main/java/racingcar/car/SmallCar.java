package racingcar.car;

public class SmallCar implements Car {
    private final String name;
    private int position = 0;

    public SmallCar(String name, int position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void move() {
        this.position++;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
