package racingcar.nextstep.application.racing;

import racingcar.nextstep.domain.car.CarService;
import racingcar.nextstep.domain.racing.RacingService;

public class RacingFacade {

    private final RacingService racingService;
    private final CarService carService;

    public RacingFacade(RacingService racingService, CarService carService) {
        this.racingService = racingService;
        this.carService = carService;
    }
}
