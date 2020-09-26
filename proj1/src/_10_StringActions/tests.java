package _10_StringActions;
 
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Semaphore;
 
public class tests {

	public static void m1() {
		// creating Random numbers
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println("Integer random is: " + random.nextInt(10));
		}
		// semaphore , number of permits
		Semaphore sem = new Semaphore(1);
		// sem.acquire();
		sem.release();
		// sem.acquire();
		System.out.println("Available Permits " + sem.availablePermits());
	}

	public static void rever() {
		String a = "Java";
		String z = "";
		for (int i = a.length(); i > 0; i--) {
			z = z + a.charAt(i - 1);
		}
		System.out.println(z);

	}

	public static void starPattern() {
		int n = 6;
		for (int i = 0; i < 6; i++) {

			for (int k = 5 - i; k >= 1; k--) {
				System.out.print(".");
			}

			for (int j = 0; j < i; j++) {
				System.out.print("* ");

			}

			System.out.println("\n");
		}
	}

	public static void subString_Split() {

		String a = "Java#Python";
		System.out.println(a.substring(0, 4));
		String[] z = a.split("#");
		System.out.println("Splitter - " + z[1]);
	}

	public static void replace_() {
		String a = "This is python";

		String z = a.replace("python", "Java");
		System.out.println(z);
	}

	public static void start_End_with() {
		String a = "This is python";

		if (a.startsWith("The")) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		if (a.endsWith("python")) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

	public static void con_joins() {
		String a = "This";

		a = a.concat(" is ").concat(" java ").concat(" ; ");
		System.out.println(a);

		ArrayList<String> s = new ArrayList<String>();
		s.add("Java");
		s.add("Python");
		s.add("c");
		s.add("c++");

		String z = String.join(",", s);
		String[] q = z.split(",");
		for (String w : q)
			System.out.println(w);
	}

	public static void indexof() {
		String a = "This is python";
		System.out.println(a.lastIndexOf('i'));
	}

	public static void regex() {

		String a = "#Java$";

		System.out.println(a.replaceAll("[`a-zA-Z0-1]", ""));

	}

	public static void stringBuffer_StringBuilder() {
		double start;
		start = System.currentTimeMillis();
		StringBuffer a = new StringBuffer("Java");
		a.append("Python");
		a.append("Python");
		a.append("Python");
		System.out.println(a);
		double end = System.currentTimeMillis() - start;
		System.out.println("String Buffer time to execute - " + end);
		start = System.currentTimeMillis();
		StringBuilder z = new StringBuilder("Java1");
		z.append("Python1");
		z.append("Python1");
		z.append("Python1");
		System.out.println(z);
		end = System.currentTimeMillis() - start;
		System.out.println("String Buffer time to execute - " + end);
	}

	public static void main(String[] args)  {
	}

}
