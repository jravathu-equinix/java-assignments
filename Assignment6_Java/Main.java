import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

/**
 * This code checks only for one level ckecking and replacing
 */

class Checker
{
    public void checker(JSONObject jsonObject)
    {
        Iterator<String> outerKeys = jsonObject.keySet().iterator();

            while (outerKeys.hasNext()) {
                String outerKey = outerKeys.next();

                JSONObject innerObject = (JSONObject) jsonObject.get(outerKey);

                Iterator<String> innerKeys = innerObject.keySet().iterator();

                while (innerKeys.hasNext()) {
                    String innerKey = innerKeys.next();

                    if (outerKey.contains(innerKey)) 
                    {
                        Object innerValue = innerObject.get(innerKey);
                        jsonObject.put(innerKey, innerValue);
                        innerKeys.remove();
                    }
                }
            }
    }
}

public class Main {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try 
        {
            Object obj = parser.parse(new FileReader("input.json"));

            JSONObject jsonObject = (JSONObject) obj;

            Checker ch = new Checker();
            ch.checker(jsonObject);

            System.out.println(jsonObject.toJSONString());

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}