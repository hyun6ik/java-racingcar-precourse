package racingcar.nextstep.global.config;

import racingcar.nextstep.application.racing.RacingFacade;
import racingcar.nextstep.domain.car.service.CarCreator;
import racingcar.nextstep.domain.car.service.CarService;
import racingcar.nextstep.domain.racing.service.RacingFactory;
import racingcar.nextstep.domain.racing.service.RacingMessenger;
import racingcar.nextstep.domain.racing.service.RacingService;
import racingcar.nextstep.domain.racing.service.RacingValidator;
import racingcar.nextstep.infrastructure.car.CarCreatorImpl;
import racingcar.nextstep.infrastructure.car.CarServiceImpl;
import racingcar.nextstep.infrastructure.racing.RacingFactoryImpl;
import racingcar.nextstep.infrastructure.racing.RacingMessengerImpl;
import racingcar.nextstep.infrastructure.racing.RacingServiceImpl;
import racingcar.nextstep.infrastructure.racing.RacingValidatorImpl;
import racingcar.nextstep.interfaces.RacingController;

public class AppConfig {

    public RacingController racingController() {
        return new RacingController(carService(), racingService());
    }

    public RacingFacade racingFacade() {
        return new RacingFacade(racingService(), carService());
    }

    public RacingService racingService() {
        return new RacingServiceImpl(racingMessenger(), racingValidator(), racingFactory());
    }

    public RacingMessenger racingMessenger() {
        return new RacingMessengerImpl();
    }

    public RacingValidator racingValidator() {
        return new RacingValidatorImpl();
    }

    public RacingFactory racingFactory() {
        return new RacingFactoryImpl();
    }

    public CarService carService() {
        return new CarServiceImpl(carCreator());
    }

    public CarCreator carCreator() {
        return new CarCreatorImpl();
    }

}
