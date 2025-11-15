package StepDefinations;

import Utilities.JsonReader;
import Utilities.YamlReader;

import java.util.HashMap;

public class AmazonStepDefinition {

    public static void main(String[] args) {
        YamlReader reader = new YamlReader();
        String value = reader.readDatafromYaml("login", "Login", "password");
        System.out.println(value);

        JsonReader jsonReader = new JsonReader();

        HashMap<String, Object> jr = jsonReader.readDataFromJson();

        System.out.println(jr);
    }
}
