package Randomizer;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RandomChar {
    private final List<String> charList;
    public RandomChar(List<String> charList) {
        this.charList = charList;
    }
    public String getRandomChar () {
        int randomCount = ThreadLocalRandom.current().nextInt(0, this.charList.toArray().length);
        return this.charList.remove(randomCount);
    }
}
