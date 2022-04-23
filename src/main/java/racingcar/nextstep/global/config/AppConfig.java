package racingcar.nextstep.global.config;

import racingcar.nextstep.application.racing.RacingFacade;
import racingcar.nextstep.domain.car.service.CarService;
import racingcar.nextstep.domain.racing.RacingMessenger;
import racingcar.nextstep.domain.racing.RacingService;
import racingcar.nextstep.domain.racing.RacingValidator;
import racingcar.nextstep.infrastructure.car.CarServiceImpl;
import racingcar.nextstep.infrastructure.racing.RacingMessengerImpl;
import racingcar.nextstep.infrastructure.racing.RacingServiceImpl;
import racingcar.nextstep.infrastructure.racing.RacingValidatorImpl;
import racingcar.nextstep.interfaces.RacingController;

public class AppConfig {

    public RacingController racingController() {
        return new RacingController(racingFacade(), racingService());
    }

    public RacingFacade racingFacade() {
        return new RacingFacade(racingService(), carService());
    }

    public RacingService racingService() {
        return new RacingServiceImpl(racingMessenger(), racingValidator());
    }

    public RacingMessenger racingMessenger() {
        return new RacingMessengerImpl();
    }

    public RacingValidator racingValidator() {
        return new RacingValidatorImpl();
    }

    public CarService carService() {
        return new CarServiceImpl();
    }

}
