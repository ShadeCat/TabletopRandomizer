package Randomizer;

public class Main {
    public static void main(String[] args) {
        Config config = new Config();
        RandomChar randomChar = new RandomChar(config.getCharacters());
        RandomMap randomMap = new RandomMap(config.getMaps());
        System.out.println("Карта номер "+randomMap.getRandomMap());
        for (int i = 0; i < config.getPlayers(); i++) {
            System.out.println("Игрок "+ (i+1)+": "+randomChar.getRandomChar());
        }
    }
}