package Utilities;

import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

public class YamlReader {

    String datapath = System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"java"
            +File.separator+"inputData"+File.separator;
    Map<String, String> datamap;

    public String readDatafromYaml(String filename, String dataset, String key) {
        try {
            Yaml yaml = new Yaml();
            Map<String, Object> datasets = yaml.load(new InputStreamReader(Files.newInputStream
                    (new File(datapath + filename + ".yaml").toPath())));
            datamap = (HashMap<String, String>) datasets.get(dataset);
        } catch (IOException e){
            e.printStackTrace();
        }
        return datamap.get(key);
    }

}
