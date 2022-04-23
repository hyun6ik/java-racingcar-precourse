package racingcar.nextstep.domain.racing;

import racingcar.nextstep.domain.car.CarsName;
import racingcar.nextstep.domain.car.RaceNumber;

public interface RacingService {
    CarsName requestCarsName();

    RaceNumber requestNumberOfAttempts();
}
