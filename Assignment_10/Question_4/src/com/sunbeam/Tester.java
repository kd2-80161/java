package com.sunbeam;

import java.util.*;

public class Tester {
	public static void main(String[] args) {
		//Collection<String> c = new ArrayList<>();
		//Collection<String> c = new HashSet<>();
		Collection<String> c = new LinkedHashSet<>();
		//Collection<String> c = new TreeSet<>();
		c.add("Gill");
		c.add("D");
		c.add("A");
		c.add("C");
		c.add(null);
		c.add(null);
		c.add(null);
		System.out.println(c.toString());
	}
}
