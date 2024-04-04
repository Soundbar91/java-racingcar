package racingcar.car;

public class MediumCar implements Car{
    private final String name;
    private int position = 0;

    public MediumCar(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        this.position += 2;
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
