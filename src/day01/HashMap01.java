package day01;

import java.util.Map;

public class HashMap01 {
    public static void main (String [] args) {
        Map map = new java.util.HashMap();

        map.put("Bilim", "12");
        map.put("Sanat", "3");
        map.put("Edebiyat", "5");
        map.put("Siyaset", "9");
        System.out.println();
        System.out.println(" Map Ögeleri: ");
        System.out.println("\t" + map);

    }
}
