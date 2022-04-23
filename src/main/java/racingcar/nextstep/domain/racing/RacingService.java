package racingcar.nextstep.domain.racing;

import racingcar.nextstep.domain.car.CarsName;

public interface RacingService {
    CarsName requestCarsName();

    int requestAttemptsOfNumber();
}
