package racingcar.nextstep.domain.racing;

import racingcar.nextstep.domain.car.Car;

public class RacingChart {

    private final Car car;
    private final String result;

    public RacingChart(Car car, String result) {
        this.car = car;
        this.result = result;
    }

    public static RacingChart of(Car car, String result) {
        return new RacingChart(car, result);
    }

    public String result() {
        return car.getCarName().getValue() + ":" + result;
    }

}
