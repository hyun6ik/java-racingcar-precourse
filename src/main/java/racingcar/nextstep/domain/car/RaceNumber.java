package racingcar.nextstep.domain.car;

import java.util.regex.Pattern;

public class RaceNumber {

    private final int value;

    public RaceNumber(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
