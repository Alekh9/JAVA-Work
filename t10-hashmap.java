package com.internshala.javaapp;


import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		/*
		*   2 = "Shashank"
		*   43 = "Rahul"
		*   13 = "Robert"
		* */

		Map<Integer, String> namesMap = new HashMap();
		namesMap.put(2, "Shashank");
		namesMap.put(43, "Rahul");
		namesMap.put(13, "Robert");

		String name = namesMap.get(43);
		System.out.println(name);

		for (Map.Entry entry: namesMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}

/*
*   Map: Interface
*   HashMap: Class that implements interface Map
*
*       class HashMap implements Map {
*           ...
*       }
*
*   Map Properties:
*       1. They contain values based on key
*       2. They are not ordered
*       3. They contain unique values
*       4. They can only store Object type data
*
* */
