package javaCollections;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level...");
        languages.put("Python", "an interpreted high level...");
        languages.put("Algol", "a description...");

//        System.out.println(languages.get("Java"));

        for(String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
