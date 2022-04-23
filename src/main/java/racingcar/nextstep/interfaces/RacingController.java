package racingcar.nextstep.interfaces;

import racingcar.nextstep.application.racing.RacingFacade;
import racingcar.nextstep.domain.car.CarsName;
import racingcar.nextstep.domain.racing.RacingService;

public class RacingController {

    private final RacingFacade racingFacade;
    private final RacingService racingService;

    public RacingController(RacingFacade racingFacade, RacingService racingService) {
        this.racingFacade = racingFacade;
        this.racingService = racingService;
    }

    public void game() {
        final CarsName carsName = racingService.requestCarsName();
        final int attemptsOfNumber = racingService.requestAttemptsOfNumber();
    }
}
