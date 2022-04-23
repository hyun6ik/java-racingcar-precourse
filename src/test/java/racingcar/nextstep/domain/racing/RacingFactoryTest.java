package racingcar.nextstep.domain.racing;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.nextstep.domain.car.CarsName;
import racingcar.nextstep.infrastructure.racing.RacingFactoryImpl;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RacingFactoryTest {

    RacingFactory racingFactory = new RacingFactoryImpl();

    @Test
    @DisplayName("입력 받은 자동차 이름들을 쉼표 기준으로 구분하기")
    void splitCarsNameWithComma() {
        //given
        final String carNameList = "pobi,crong,honux";
        //when
        final String[] result = racingFactory.splitCarsNameWithComma(carNameList);
        //then
        assertThat(result).containsExactly("pobi", "crong", "honux");
    }


}