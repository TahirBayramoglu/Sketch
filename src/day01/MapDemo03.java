package day01;

import java.util.Map;



public class MapDemo03 {

	Map<String, String> map1, map2;
	
	public static void main (String [] args) {
		MapDemo03 md = new MapDemo03 ();
		md.map1 = put ("ALATLI", "20895548");
		md.map1 = put ("DAMLA", "20894828");
		md.map1 = put ("AYKUT", "20893085");
		md.map1 = put ("CAN", "20793172");
		System.out.println();
		System.out.println("Map Ögeleri: ");
		System.out.println("\t" + md.map1);
		
	
	}
}
