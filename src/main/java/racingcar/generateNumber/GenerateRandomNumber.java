package racingcar.generateNumber;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class GenerateRandomNumber {
    private final int randomNumberMin;
    private final int randomNumberMax;
    private final int randomNumberStandard;

    public GenerateRandomNumber(int randomNumberMin, int randomNumberMax, int randomNumberStandard) {
        this.randomNumberMin = randomNumberMin;
        this.randomNumberMax = randomNumberMax;
        this.randomNumberStandard = randomNumberStandard;
    }

    public boolean randomNumber() {
        return pickNumberInRange(randomNumberMin, randomNumberMax) >= randomNumberStandard;
    }
}
