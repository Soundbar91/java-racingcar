package racingcar.generator;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class RandomNumberCreate implements RandomNumberGenerator{
    @Override
    public int randomNumber(int min, int max) {
        return pickNumberInRange(min, max);
    }
}
