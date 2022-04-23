package racingcar.nextstep.global.config;

import racingcar.nextstep.application.racing.RacingFacade;
import racingcar.nextstep.domain.car.service.CarService;
import racingcar.nextstep.domain.racing.RacingService;
import racingcar.nextstep.infrastructure.car.CarServiceImpl;
import racingcar.nextstep.infrastructure.racing.RacingServiceImpl;
import racingcar.nextstep.interfaces.RacingController;

public class AppConfig {

    public RacingController racingController() {
        return new RacingController(racingFacade(), racingService());
    }

    public RacingFacade racingFacade() {
        return new RacingFacade(racingService(), carService());
    }

    public RacingService racingService() {
        return new RacingServiceImpl();
    }

    public CarService carService() {
        return new CarServiceImpl();
    }
}
