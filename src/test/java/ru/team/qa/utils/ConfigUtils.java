package ru.team.qa.utils;

import lombok.SneakyThrows;
import org.springframework.core.io.ClassPathResource;

import java.io.*;
import java.util.Properties;

public class ConfigUtils {
    private static String OPT_ACTIVE_PROPERTIES = "activeProperties";

    @SneakyThrows
    private static Properties loadProps(String classpath) {
        Properties properties = new Properties();
        properties.load(new ClassPathResource(classpath).getInputStream());
        return properties;
    }

    @SneakyThrows
    public static Properties loadProperties() { return loadProps(); }

    public static Properties loadProps() {
        System.out.println("\t= = = LOAD PROPERTIES = = =");
        String activeProperties = getActiveProperties();
        InputStream resource = ConfigUtils.class.getResourceAsStream(activeProperties);
        if (resource == null) {
            File file = new File(activeProperties);
            System.out.printf("File exists = %s\n", file.exists());
            try {
                resource = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                e.getStackTrace();
            }
        }
        Properties properties = new Properties(System.getProperties());
        try {
            properties.load(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.setProperties(properties);
        return properties;
    }

    private static String getActiveProperties() { // это для командной строки
        String props = System.getProperty(OPT_ACTIVE_PROPERTIES); // если в параметрах запуска есть -DactiveProperties
        return props != null ? props : System.getenv(OPT_ACTIVE_PROPERTIES); // то этот путь запишется в Properties
    }

    public static String getProperty(String key) {
        String result = System.getProperty(key);
        if (result == null || result.trim().equals(""))
            System.err.printf("Параметр %s отсутствует", key);
        return result;
    }

}
