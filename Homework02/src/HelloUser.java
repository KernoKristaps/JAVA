
import java.util.Scanner;

public class HelloUser {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ievadi savu v�rdu un uzv�rdu: ");
		String NAME = scanner.next();
		String SURNAME = scanner.next(); //nextLine() nolasa visu rindi�u
		scanner.close();
		
		String NAME1 = NAME.substring(0, 1).toUpperCase() + NAME.substring(1).toLowerCase();
			 
		System.out.println("'" + NAME1);
		System.out.println(SURNAME.toUpperCase() + "'");

	}



	
	}


