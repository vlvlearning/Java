package _09_expt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class except_try {

	public static void m1(int a) {
		try {
			// if(1/0==0)
			// {
			//
			// }
			
			if(1/0 ==0)
			{
				
			}
			
			String r = "try";
			FileInputStream y = new FileInputStream(
					"Path\\try1.txt");

			System.out.println("This is python " + a);

		} catch (FileNotFoundException e1) {
			System.out.println("File is not in given location - " + e1);
		}

		catch (Exception e) {
			System.out.println("m1 method is not working - " + e);
		} finally {
			System.out.println("Hi, This is Java");
		}
	}

	public static void main(String[] args) {

		m1(5);
	}

}
