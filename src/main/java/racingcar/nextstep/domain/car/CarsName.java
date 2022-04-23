package racingcar.nextstep.domain.car;

import java.util.List;

public class CarsName {

    private final List<CarName> carNames;

    public CarsName(List<CarName> carNames) {
        this.carNames = carNames;
    }

    public List<CarName> getCarNames() {
        return carNames;
    }
}
