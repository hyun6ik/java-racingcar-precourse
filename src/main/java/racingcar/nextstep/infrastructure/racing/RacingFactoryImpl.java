package racingcar.nextstep.infrastructure.racing;

import racingcar.nextstep.domain.car.CarName;
import racingcar.nextstep.domain.car.Cars;
import racingcar.nextstep.domain.car.CarsName;
import racingcar.nextstep.domain.racing.RacingChart;
import racingcar.nextstep.domain.racing.RacingCharts;
import racingcar.nextstep.domain.racing.RacingFactory;

import java.util.ArrayList;
import java.util.List;

public class RacingFactoryImpl implements RacingFactory {

    private static final String COMMA = ",";

    @Override
    public String[] splitCarsNameWithComma(String carsName) {
        return carsName.split(COMMA);
    }

    @Override
    public CarsName createCarsName(String[] splitCarsName) {
        final List<CarName> carNameList = new ArrayList<>();

        for (String name : splitCarsName) {
            carNameList.add(CarName.of(name));
        }

        return CarsName.of(carNameList);
    }

    @Override
    public int convertStringNumberToInteger(String attemptsOfNumber) {
        return Integer.parseInt(attemptsOfNumber);
    }

    @Override
    public RacingCharts createRacingCharts(Cars cars) {
        final List<RacingChart> racingChartList = new ArrayList<>();

        cars.getCars().iterator()
                .forEachRemaining(car -> racingChartList.add(car.createRacingChart()));

        return RacingCharts.of(racingChartList);
    }
}
