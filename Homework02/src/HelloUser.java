
import java.util.Scanner;

public class HelloUser {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ievadi savu vârdu un uzvârdu: ");
		String NAME = scanner.next();
		String SURNAME = scanner.next(); //nextLine() nolasa visu rindiòu
		scanner.close();
		
		String NAME1 = NAME.substring(0, 1).toUpperCase() + NAME.substring(1).toLowerCase();
			 
		System.out.println("'" + NAME1);
		System.out.println(SURNAME.toUpperCase() + "'");

	}



	
	}


