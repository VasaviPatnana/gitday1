package org.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class Welcome {
	public static void main(String[] args) {
		Map<Integer, String> mp= new LinkedHashMap<>();
		mp.put(10, "vasavi");
		mp.put(20, "jyothi");
		mp.put(30,"lavanya");
		System.out.println(mp);
	}

}
