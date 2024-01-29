package com.java.Collections.collection5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map1 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(5, "Eban");
        map.put(2, "Timmy");
        map.put(9, "Jimmy");
        map.put(6, "John");
        map.put(1, "Vikky");
        map.put(12, "Tom");
        System.out.println(map);


        Collection<String> names = map.values();
        System.out.println(names);


        Set<Integer> keys = map.keySet();
        System.out.println(keys);

		map.put(5,"Heeren");
		System.out.println(map);
    }
}
