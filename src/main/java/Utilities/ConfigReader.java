package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Properties;

public class ConfigReader {

     static final String filepath = System.getProperty("User.dir")+File.pathSeparator+"src"+File.pathSeparator+"main"
            +File.pathSeparator+"Cucumber.properties";

    public String getProperties(String key) throws IOException {
        Properties prop = new Properties();
        prop.load(Files.newInputStream(new File(filepath).toPath()));
        return prop.getProperty(key);
    }
}
