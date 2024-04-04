package racingcar.car;

public class LargeCar implements Car{
    private final String name;
    private int position = 0;

    public LargeCar(String name, int position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void move() {
        this.position += 4;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
