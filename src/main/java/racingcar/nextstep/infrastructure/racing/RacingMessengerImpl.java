package racingcar.nextstep.infrastructure.racing;

import racingcar.nextstep.domain.racing.RacingCharts;
import racingcar.nextstep.domain.racing.RacingMessenger;
import racingcar.nextstep.global.message.TextMessage;
import racingcar.nextstep.global.utils.Console;

public class RacingMessengerImpl implements RacingMessenger {

    @Override
    public String requestCarsName() {
        printMessage(TextMessage.REQUEST_CARS_NAME);
        return Console.readLine();
    }

    @Override
    public String requestAttemptsOfNumber() {
        printMessage(TextMessage.REQUEST_ATTEMPT_NUMBER);
        return Console.readLine();
    }

    @Override
    public void printResultMessage() {
        printMessage(TextMessage.RACING_RESULT);
    }

    @Override
    public void printRacingCharts(RacingCharts racingCharts) {
        racingCharts.getRacingResults().iterator().forEachRemaining(racingChart -> printMessage(racingChart.result()));
        printInLine();
    }

    private void printInLine() {
        System.out.println();
    }

    private void printMessage(String message) {
        System.out.println(message);
    }
}
