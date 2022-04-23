package racingcar.nextstep.infrastructure.racing;

import racingcar.nextstep.domain.car.Cars;
import racingcar.nextstep.domain.car.CarsName;
import racingcar.nextstep.domain.racing.chart.RacingCharts;
import racingcar.nextstep.domain.racing.service.RacingFactory;
import racingcar.nextstep.domain.racing.service.RacingMessenger;
import racingcar.nextstep.domain.racing.service.RacingService;
import racingcar.nextstep.domain.racing.service.RacingValidator;
import racingcar.nextstep.global.message.Number;

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

    @Override
    public void printRacingResult(Cars cars, int attemptsOfNumber) {
        for (int i = Number.MIN_VALUE; i < attemptsOfNumber; i++) {
            final RacingCharts racingCharts = racingFactory.createRacingCharts(cars);
            racingMessenger.printRacingCharts(racingCharts);
        }
    }

}
