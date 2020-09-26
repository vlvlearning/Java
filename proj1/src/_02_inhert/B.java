package _02_inhert;

public class B extends A{
	
	public void m1(int a, int b) {
		int z = 0;
		z = a + b;
		if (z % 2 != 0) {
			z = 404;
		} else {
			w = true;
		}
	}
	public static void main(String[] args) {
		B obj = new B();
		obj.m1(5,5);
		obj.m2();
		}

}
