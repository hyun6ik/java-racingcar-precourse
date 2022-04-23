package racingcar.nextstep.domain.player;

public class Player {

    private RaceNumber raceNumber;
    private CarName carName;

    public Player() {

    }

    public Player(RaceNumber raceNumber, CarName carName) {
        this.raceNumber = raceNumber;
        this.carName = carName;
    }

    public void inputRaceNumber(RaceNumber raceNumber) {
        this.raceNumber = raceNumber;
    }

    public void inputCarName(CarName carName) {
        this.carName = carName;
    }

    public RaceNumber getRaceNumber() {
        return raceNumber;
    }

    public CarName getCarName() {
        return carName;
    }

    public static Player of(RaceNumber raceNumber, CarName carName) {
        return new Player(raceNumber, carName);
    }
}
