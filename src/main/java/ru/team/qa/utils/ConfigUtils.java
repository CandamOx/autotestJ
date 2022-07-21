package ru.team.qa.utils;

import lombok.SneakyThrows;

import java.util.Properties;

public class ConfigUtils {
    private static String OPT_ACTIVE_PROPERTIES = "activeProperties";

    @SneakyThrows
    private static Properties loadProps(String classpath) {
        String activeProperties = getActiveProperties();
        Properties properties = new Properties(System.getProperties());
        return properties;
    }

    @SneakyThrows
    public static Properties loadProperties() { return loadProps(); }

    public static Properties loadProps() {
        String activeProperties = getActiveProperties();
        Properties properties = new Properties(System.getProperties());
        return properties;
    }

    private static String getActiveProperties() {
        return System.getProperty(OPT_ACTIVE_PROPERTIES);
    }
}
