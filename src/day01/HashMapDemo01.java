package day01;

import java.util.*;

public class HashMapDemo01 {

    public static void main (String[] args) {
        HashMap hm = new HashMap();
        hm.put ("ALATLI MERVE", new Integer (208995548));
        hm.put ("AYGUN DAMLA", new Integer (20094828));
        hm.put ("BUYUKKILIC MURAT", new Integer (208893085));
        hm.put ("CAN FEHIME", new Integer (20793172));
        hm.put ("CANER HALIL", new Integer (20393385));
        hm.put ("CALIK FATIH", new Integer (20893682));

        Set set = hm.entrySet();

        Iterator i = set.iterator();

        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.println(me.getKey() + " : " + me.getValue() );
        }
        // Aygun Damla'nin numarasini duzelt
        hm.put ("AYGUN DAMLA", new Integer(20894828));
        System.out.println("AYGUN DAMLA'nin numarasi : " + hm.get("AYGUN DAMLA"));

    }
}