package racingcar.nextstep.domain.racing;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.nextstep.global.message.ErrorMessage;
import racingcar.nextstep.infrastructure.racing.RacingValidatorImpl;

import static org.junit.jupiter.api.Assertions.*;

class RacingValidatorTest {

    RacingValidator racingValidator = new RacingValidatorImpl();

    @Test
    @DisplayName("시도 횟수 입력 - 숫자가 아닌 문자를 입력했으면 IllegalArgumentException 발생")
    void isNumber_fail() {
        //given
        final String inputNumber = "12a";
        //when && then
        Assertions.assertThatThrownBy(() -> racingValidator.isNumber(inputNumber))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMessage.IS_NOT_NUMBER);
    }

}