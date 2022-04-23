package racingcar.nextstep.domain.racing;

public interface RacingMessenger {
    String requestCarsName();

    String requestAttemptsOfNumber();

    void printResultMessage();

    void printRacingCharts(RacingCharts racingCharts);
}
