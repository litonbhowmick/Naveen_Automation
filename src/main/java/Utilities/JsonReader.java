package Utilities;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class JsonReader {

    public HashMap<String, Object> readDataFromJson() {
        HashMap<String, Object> result = null;
        try {
            String filepath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "java"
                    + File.separator + "inputData" + File.separator + "login.json";
            result = (HashMap<String, Object>) new ObjectMapper().readValue(filepath, Map.class);
        } catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

}
