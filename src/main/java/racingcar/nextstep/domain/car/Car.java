package racingcar.nextstep.domain.car;

public class Car {

    private final CarName carName;
    private final CarPosition carPosition;


    public Car(CarName carName) {
        this.carName = carName;
        this.carPosition = CarPosition.zero();
    }

    public CarName getCarName() {
        return carName;
    }

    public CarPosition getCarPosition() {
        return carPosition;
    }

    public static Car of(CarName carName) {
        return new Car(carName);
    }
}
