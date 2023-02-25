import org.json.simple.*;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) 
    {
        try
        {
            // File input using Scanner
            File file = new File("input.json");
            Scanner sc = new Scanner(file);
            StringBuilder jsonToString = new StringBuilder();
            while(sc.hasNextLine())
            {
                jsonToString.append(sc.nextLine());
            }
            sc.close();


            JSONParser jp = new JSONParser();
            Object obj = jp.parse(jsonToString.toString());
            JSONArray personsArr = (JSONArray) obj;

            // ArrayList to append each person object
            ArrayList<String> personsList = new ArrayList<>();

            for(Object personObj : personsArr)
            {
                JSONObject person = (JSONObject) personObj;

                String name = (String) person.get("name");
                Long age = (Long) person.get("age");
                String email = (String) person.get("email");

                String personString = name + " - " + age + " - " + email;
                personsList.add(personString);
            }

            for(String person : personsList)
            {
                System.out.println(person);
            }

        } 
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}