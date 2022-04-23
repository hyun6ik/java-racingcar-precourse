package racingcar.nextstep.domain.car;

public class Car {

    private final CarName carName;
    private final CarPosition carPosition;


    public Car(CarName carName, CarPosition carPosition) {
        this.carName = carName;
        this.carPosition = carPosition;
    }

    public CarName getCarName() {
        return carName;
    }

    public CarPosition getCarPosition() {
        return carPosition;
    }
}
