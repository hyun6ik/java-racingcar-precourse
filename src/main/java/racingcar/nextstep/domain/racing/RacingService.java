package racingcar.nextstep.domain.racing;

import racingcar.nextstep.domain.car.Cars;
import racingcar.nextstep.domain.car.CarsName;

public interface RacingService {
    CarsName requestCarsName();

    int requestAttemptsOfNumber();

    void startRacing(Cars cars, int attemptsOfNumber);

}
