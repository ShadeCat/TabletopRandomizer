package Randomizer;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class Config {
    private final int maps;
    private final int players;

    private final List<String> characters;
    @SuppressWarnings("unchecked")
    public Config() {
        Yaml yaml = new Yaml();
        InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream("config.yaml");
        Map<String, Object> obj = yaml.load(inputStream);
        this.maps = (int) obj.get("Maps");
        this.players = (int) obj.get("Players");
        this.characters = (List<String>) obj.get("Characters");
    }

    public int getMaps (){
        return this.maps;
    }
    public int getPlayers (){
        return this.players;
    }

    public List<String> getCharacters () {
        return this.characters;
    }
}
