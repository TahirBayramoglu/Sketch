package day01;

import java.util.*;

public class MapDemo01 {
    public HashMap hashMap;
    //veriyi siralamak icin Treemap yapisi
    private TreeMap treeMap;

    public void startDemo(){
        hashMap = new HashMap();
        hashMap.put ("Key1", new Double(3434.34));
        hashMap.put ("Key2", new Integer (123));
        hashMap.put ("Key3", new String (" Stockholm"));
        hashMap.put ("Key4", new Boolean (true));

        // Sort the hash map using a tree map
        treeMap = new TreeMap (hashMap);

    }

    public static void main ( String[] args) {

        MapDemo01 md = new MapDemo01();
        md.startDemo ();

        System.out.print (" HashMap :  ");
        System.out.println (md.hashMap);
        System.out.print (" TreeMap :  ");
        System.out.println ( md.treeMap);

    }
}