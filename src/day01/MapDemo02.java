package day01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo02 {
    public static void main (String [] args) {
        Map map = new HashMap();
        map.put("Karacay", "ist264");
        map.put("Umut", "ist378");
        map.put("Özlem", "ist254");
        map.put("Erdem", "ist360");

        System.out.println ("Map        :"  + map);
        System.out.println("hashCode()  :"  + map.hashCode() );
        System.out.println("entrySet()  :"  + map.entrySet());
        System.out.println("values()    :"  + map.values());
        System.out.println("keyset()    :"  + map.keySet()  );

    }
}
