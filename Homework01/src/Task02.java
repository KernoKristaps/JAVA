import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ievadi savu vârdu: ");
		String NAME;
		NAME = scanner.next();
	
		System.out.println("Ievadi savu vecumu: ");
		int AGE;
		AGE = scanner.nextInt();
		
		
		System.out.println("Sveiki, mani sauc " + NAME + " esmu " + AGE + " gadus jauns!");

	}

}
