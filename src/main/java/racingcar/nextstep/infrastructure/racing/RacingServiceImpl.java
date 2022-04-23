package racingcar.nextstep.infrastructure.racing;

import racingcar.nextstep.domain.car.CarsName;
import racingcar.nextstep.domain.racing.RacingFactory;
import racingcar.nextstep.domain.racing.RacingMessenger;
import racingcar.nextstep.domain.racing.RacingService;
import racingcar.nextstep.domain.racing.RacingValidator;

public class RacingServiceImpl implements RacingService {

    private final RacingMessenger racingMessenger;
    private final RacingValidator racingValidator;
    private final RacingFactory racingFactory;

    public RacingServiceImpl(RacingMessenger racingMessenger, RacingValidator racingValidator, RacingFactory racingFactory) {
        this.racingMessenger = racingMessenger;
        this.racingValidator = racingValidator;
        this.racingFactory = racingFactory;
    }

    @Override
    public CarsName requestCarsName() {
        final String carsName = racingMessenger.requestCarsName();
        final String[] splitCarNames = racingFactory.splitCarsNameWithComma(carsName);
        return racingFactory.createCarsName(splitCarNames);
    }
}
