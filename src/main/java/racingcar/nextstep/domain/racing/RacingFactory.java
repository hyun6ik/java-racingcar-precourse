package racingcar.nextstep.domain.racing;

import racingcar.nextstep.domain.car.CarsName;

public interface RacingFactory {
    String[] splitCarsNameWithComma(String carsName);

    CarsName createCarsName(String[] carNameList);
}
