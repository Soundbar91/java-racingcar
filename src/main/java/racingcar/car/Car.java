package racingcar.car;

public abstract class Car {
    protected String name = "";
    protected int position = 0;

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public abstract void move();
}
