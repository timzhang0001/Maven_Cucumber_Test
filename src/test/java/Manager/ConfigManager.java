package Manager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {
    public static final String CONFIG_FILE_PATH = "src/test/resources/config/configuration.properties";
    private static Properties properties;

    static {
        try (BufferedReader reader = new BufferedReader(new FileReader(CONFIG_FILE_PATH))) {
            properties = new Properties();
            properties.load(reader);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Failed to load configuration.properties", e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getUrl() {
        String url = properties.getProperty("url");
        if (url != null) {
            return url;
        } else {
            throw new RuntimeException("url not specified in the config.properties");
        }
    }

    public static String getUsername() {
        String username = properties.getProperty("username");
        if (username != null) {
            return username;
        } else {
            throw new RuntimeException("username not specified in the config.properties");
        }
    }

    public static String getPassword() {
        String password = properties.getProperty("password");
        if (password != null) {
            return password;
        } else {
            throw new RuntimeException("password not specified in the config.properties");
        }
    }

    public static String getBrowserType() {
        String browserType = properties.getProperty("browserType");
        if (browserType != null) {
            return browserType;
        } else {
            throw new RuntimeException("browserType not specified in the config.properties");
        }
    }

    public static String getImplicitlyWait() {
        String implicitlyWait = properties.getProperty("implicitlyWait");
        if (implicitlyWait != null) {
            return implicitlyWait;
        } else {
            throw new RuntimeException("implicitlyWait not specified in the config.properties");
        }
    }


}
