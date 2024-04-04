package racingcar.car;

public class LargeCar implements Car{
    private final String name;
    private int position = 0;

    public LargeCar(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        this.position += 4;
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
