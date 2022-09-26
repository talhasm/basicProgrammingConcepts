package DogGenetics;
import java.util.Scanner;
import java.util.Random;

//Write a program that asks the user for the name of their dog, and then generates a fake DNA background report on the pet dog.
//It should assign a random percentage to 5 dog breeds (that should add up to 100%!) 

public class DogGenetics {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		System.out.println("What is your dog's name? ");
	    String dogName = user_input.nextLine();  // Read user input
		System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.\n");
		randomPercentage();
		
	}
		
	public static void randomPercentage() {
    	Random obj = new Random();
       
        int n1 = obj.nextInt(100);
        int n2 = obj.nextInt(100 - n1);
        int n3 = obj.nextInt(100 - n1 - n2);
        int n4 = obj.nextInt(100 - n1 - n2 - n3);
        int n5 = 100 - n1 - n2 - n3 - n4;
            
        System.out.println(n1 + "% St. Bernard");
        System.out.println(n2 + "% Chihuahua"); 
        System.out.println(n3 + "% Dramatic RedNosed Asian Pug"); 
        System.out.println(n4 + "% Common Cur");
        System.out.println(n5 + "% King Doberman");
    }
}