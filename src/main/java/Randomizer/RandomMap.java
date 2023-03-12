package Randomizer;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RandomMap {
    private final int maps;
    public RandomMap(int maps) {
        this.maps = maps;
    }
    public int getRandomMap () {
        return ThreadLocalRandom.current().nextInt(1, this.maps + 1);
    }
}
