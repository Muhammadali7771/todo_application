package org.example.httpserver.config;

import java.util.ResourceBundle;

public class SettingsConfig {
    private static final ResourceBundle settings = ResourceBundle.getBundle("application");

    public static String get(String key) {
        return settings.getString(key);
    }
}
