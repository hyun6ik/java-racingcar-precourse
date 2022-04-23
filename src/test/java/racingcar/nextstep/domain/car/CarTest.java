package racingcar.nextstep.domain.car;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    Car car = Car.of(CarName.of("aaa"));

    @Test
    void racing() {
        //given && when
        for (int i = 0; i < 100; i++) {
            car.racing();
        }
        //then
        assertThat(car.getCarPosition().getValue()).isNotEqualTo(0);
    }
}
