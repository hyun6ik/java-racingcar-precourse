package racingcar.nextstep.domain.racing;

public interface RacingValidator {
    void isNumber(String stringNumber);

    void isCarNameNotExceedingFive(String[] splitCarNames);
}
