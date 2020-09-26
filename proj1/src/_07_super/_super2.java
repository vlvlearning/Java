package _07_super;

public class _super2 extends _super1{
	  
	public _super2()
	{ 
		super();
	}
	

	public static void main(String[] args) {
		System.out.println(_super1.get());
		_super2 b = new _super2();
		System.out.println(_super1.get());
		
		

	}

}
