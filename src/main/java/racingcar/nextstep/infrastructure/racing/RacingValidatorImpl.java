package racingcar.nextstep.infrastructure.racing;

import racingcar.nextstep.domain.racing.RacingValidator;
import racingcar.nextstep.global.message.ErrorMessage;

import java.util.regex.Pattern;

public class RacingValidatorImpl implements RacingValidator {

    private static final Pattern isNumber = Pattern.compile("^[0-9]*$");

    @Override
    public void isNumber(String input) {
        if (!isNumber.matcher(input).matches()) {
            throw new IllegalArgumentException(ErrorMessage.IS_NOT_NUMBER);
        }
    }
}
