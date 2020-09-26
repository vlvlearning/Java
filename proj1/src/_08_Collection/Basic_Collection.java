package _08_Collection;

import java.util.ArrayList;
import java.util.HashMap;

import _03_polym.*;

public class Basic_Collection extends p1 {
	public static void _array_() {
		String[] z = { "Java", "j-1.1", "python", "1.2", "perl" };
		// int[] s = { 1, 2, 3, 4 };
		boolean a = true;
		for (int i = 0; i < z.length; i++) {
			if (z[i].equals("python1")) {
				a = false;
				System.out.println("Python is available in array");
			}
		}
		if (a) {
			System.out.println("Pyhton is nopt availble in this list");
		}
	}

	public static void _arraylist0_() {

		ArrayList<String> a = new ArrayList<String>();

		a.add("Java");
		a.add("j-1.1");
		a.add("Python");
		a.add("1.2");
		a.add("perl");

		for (String s : a) {
			System.out.println(s);
		}

		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).toString().trim().equals("Python")) {
				a.remove("");
			}
		}
		a.remove("Python");
	}

	public static void _HashMap() {
		HashMap<String, String> t = new HashMap<String, String>();
		t.put("1", "java");
		t.put("2", "c");
		System.out.println(t.get("1"));
	}

	public static void main(String[] args) {

	}
}
