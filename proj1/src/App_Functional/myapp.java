package App_Functional;

public class myapp {

	public void verifylogin(int id) {
		int[] userid = { 102, 100 }; // DB
		boolean a = true;
		for (int i = 0; i < userid.length; i++) {
			if (userid[i] == id) {
				a = false;
				System.out.println("Successfully logged In"); 
			}
		} 
		if (a) {
			System.out.println("Please provide valid USER-ID");
		} 
	}

	public static void main(String[] args) {
		myapp obj = new myapp();
		obj.verifylogin(102);
	}
}
