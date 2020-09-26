package _04_Abstract;

public class Dog extends Animal{

	   public void sound(){
		System.out.println("Woof");
	   }
	   public static void main(String args[]){
		Animal obj = new Dog();
		obj.sound();
		obj.a = 100;
	   }
	}