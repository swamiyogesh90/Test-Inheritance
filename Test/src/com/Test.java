package com;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

		/*int a = 1;

		switch (a) {
		case 1:
			System.out.println("One");
			break;

		case 2:
			System.out.println("Two");
			break;

		case 3:
			System.out.println("Three");
			break;

		case 4:
			System.out.println("Four");
			break;

		default:
			System.out.println("Default");
			break;
		}*/
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		String remove = map.remove(2);
		System.out.println(remove);
		remove = map.remove(1);
		System.out.println(remove);

	}

}
