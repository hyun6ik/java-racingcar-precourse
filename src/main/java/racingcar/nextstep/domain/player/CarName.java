package racingcar.nextstep.domain.player;

public class CarName {

    private final String name;

    public CarName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static CarName of(String name) {
        return new CarName(name);
    }

}
