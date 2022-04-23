package racingcar.nextstep.infrastructure.racing;

import racingcar.nextstep.domain.car.Cars;
import racingcar.nextstep.domain.car.CarsName;
import racingcar.nextstep.domain.racing.*;
import racingcar.nextstep.global.message.Number;

public class RacingServiceImpl implements RacingService {

    private final RacingMessenger racingMessenger;
    private final RacingValidator racingValidator;
    private final RacingFactory racingFactory;
    private final RacingReferee racingReferee;

    public RacingServiceImpl(RacingMessenger racingMessenger, RacingValidator racingValidator, RacingFactory racingFactory, RacingReferee racingReferee) {
        this.racingMessenger = racingMessenger;
        this.racingValidator = racingValidator;
        this.racingFactory = racingFactory;
        this.racingReferee = racingReferee;
    }

    @Override
    public CarsName requestCarsName() {
        final String carsName = racingMessenger.requestCarsName();
        final String[] splitCarNames = racingFactory.splitCarsNameWithComma(carsName);
        racingValidator.isCarNameNotExceedingFive(splitCarNames);
        racingValidator.isCarNameNotBlank(splitCarNames);
        return racingFactory.createCarsName(splitCarNames);
    }

    @Override
    public int requestAttemptsOfNumber() {
        final String stringNumber = racingMessenger.requestAttemptsOfNumber();
        racingValidator.isNumber(stringNumber);
        return racingFactory.convertStringNumberToInteger(stringNumber);
    }

    @Override
    public void startRacing(Cars cars, int attemptsOfNumber) {
        racingMessenger.printResultMessage();
        for (int i = Number.MIN_VALUE; i < attemptsOfNumber; i++) {
            cars.racing();
        }
    }



}
