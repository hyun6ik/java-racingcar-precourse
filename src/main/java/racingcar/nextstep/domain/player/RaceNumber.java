package racingcar.nextstep.domain.player;

import java.util.regex.Pattern;

public class RaceNumber {

    private static final Pattern isNumber = Pattern.compile("^[0-9]*?");

    private final int value;

    public RaceNumber(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


    public static RaceNumber of(int value) {
        return new RaceNumber(value);
    }
}
