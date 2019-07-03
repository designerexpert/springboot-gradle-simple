package com.example.greeting;

import java.io.IOException;
import java.io.StringWriter;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.minidev.json.JSONObject;

/**
 * Greeting
 */
@Setter
@Getter
@ToString
public class Greeting {

    private final String phrase;
    private final String name;

    public Greeting(String phraseString, String nameString) {
        phrase = phraseString;
        name = nameString;
    }

    public String toString() {
        JSONObject obj = new JSONObject();
        obj.put("phrase", phrase);
        obj.put("name", name);

        StringWriter out = new StringWriter();
        try {
            obj.writeJSONString(out);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        String jsonText = out.toString();
        return jsonText;
    }

}