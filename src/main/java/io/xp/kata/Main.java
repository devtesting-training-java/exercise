package io.xp.kata;

import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        String greeting = loadExampleProperties();
        String name = "developer";
        if (args.length > 0) {
            name = args[0];
        }
        System.out.printf("%s %s", greeting, name);
    }

    private static String loadExampleProperties() {
        try {
            Properties properties = new Properties();
            properties.load(Main.class.getResourceAsStream("/config.properties"));
            return properties.getProperty("greeting");
        } catch (IOException e) {
            return "";
        }
    }
}
