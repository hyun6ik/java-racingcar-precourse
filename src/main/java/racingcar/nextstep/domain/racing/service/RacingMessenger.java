package racingcar.nextstep.domain.racing.service;

import racingcar.nextstep.domain.racing.chart.RacingCharts;

public interface RacingMessenger {
    String requestCarsName();

    String requestAttemptsOfNumber();

    void printResultMessage();

    void printRacingCharts(RacingCharts racingCharts);
}
