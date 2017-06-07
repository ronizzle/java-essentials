package com.example.essentials;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class HashMapExamples {
    static void showExamples() {
        Map <String, String> map = new HashMap<>();
        map.put("Warriors", "Curry");
        map.put("Spurs", "Leonard");
        System.out.println(map);
        map.put("Blazers", "Lillard");
        System.out.println(map);

        System.out.println(map.get("Spurs"));

        map.remove("Warriors");
        System.out.println(map);

        map.put("Warriors", "Curry");
        map.put("TNC", "Raven");

        Set <String> keys = map.keySet();
        Iterator <String> iterator = keys.iterator();
        String key;
        while(iterator.hasNext()) {
            key = iterator.next();
            System.out.println(map.get(key) + " plays for the " + key + ".");
        }
    }
}
