package _07_super;

public class _super1{
	public static  int a =100;
	public _super1()
	{
		a = 10;
		//System.out.println("Python-1");
	}
	public _super1(int a)
	{
		System.out.println("Python-2");
	}
	
	public static int get()
	{
		return  a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_super1 a = new _super1(6);
	}

}
