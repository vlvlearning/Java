package _03_polym;

public class p1 {

public int a,b;  // obj

	public void m1() // method
	{ 
		a = 5;
		b = 7;
		int c = a+b;
		System.out.println(c);
	}
	public void m1(int ...a)
	{
		 for(int i : a)
		 {
			 System.out.println(i);
		 }
	}
	
	// Main
	public static void main(String[] args) {	
		p1 obj = new p1();
		obj.m1(1);
		 
	}

}
