package racingcar.nextstep.infrastructure.racing;

import racingcar.nextstep.domain.racing.RacingMessenger;
import racingcar.nextstep.global.message.TextMessage;
import racingcar.nextstep.global.utils.Console;

public class RacingMessengerImpl implements RacingMessenger {

    @Override
    public String requestCarsName() {
        printMessage(TextMessage.REQUEST_CARS_NAME);
        return Console.readLine();
    }

    private void printMessage(String message) {
        System.out.println(message);
    }
}
