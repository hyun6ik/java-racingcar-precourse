package racingcar.nextstep.infrastructure.racing;

import racingcar.nextstep.domain.car.CarsName;
import racingcar.nextstep.domain.car.RaceNumber;
import racingcar.nextstep.domain.racing.RacingMessenger;
import racingcar.nextstep.domain.racing.RacingService;
import racingcar.nextstep.domain.racing.RacingValidator;

public class RacingServiceImpl implements RacingService {

    private final RacingMessenger racingMessenger;
    private final RacingValidator racingValidator;

    public RacingServiceImpl(RacingMessenger racingMessenger, RacingValidator racingValidator) {
        this.racingMessenger = racingMessenger;
        this.racingValidator = racingValidator;
    }

    @Override
    public CarsName requestCarsName() {
        return null;
    }

    @Override
    public RaceNumber requestNumberOfAttempts() {
        return null;
    }
}
