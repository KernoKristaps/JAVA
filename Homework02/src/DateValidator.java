import java.util.Scanner;

public class DateValidator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// date
		System.out.println("Ievadi m�ne�a dienu!");
		int date = scanner.nextInt();
		System.out.println("Ievadi m�ne�a datumu : ");
		int month = scanner.nextInt();
	
		if (date <= 0 && date > 31) {
			System.out.println("Nav t�da m�ne�a diena !!! ");
		} else  {
		     System.out.println(" Paldies ");
		}
		
		
		
		
		// month
	
		
		if (month == 0 && month > 12) {
			System.out.println("Nav t�da m�ne�a datuma !!! ");
		} 	 else  {
		     System.out.println(" Paldies ");
		}
		scanner.close();
		
		if (month == 1) {
		    System.out.println(date + ". Janv�ris");
		} else if (month == 2) {
		    System.out.println(date + ". Febru�ris");
		} else if (month == 3) {
			System.out.println(date + ". Marts");
		} else if (month == 4) {
			System.out.println(date + ". Apr�lis");
		} else if (month == 5) {
			System.out.println(date + ". Maijs");
		} else if (month == 6) {
			System.out.println(date + ". J�nijs");
		} else if (month == 7) {
			System.out.println(date + ". J�lijs");
		} else if (month == 8) {
			System.out.println(date + ". Augusts");
		} else if (month == 9) {
			System.out.println(date + ". Septembris");
		} else if (month == 10) {
			System.out.println(date + ". Oktobris");
		} else if (month == 11) {
			System.out.println(date + ". Novembris");
		} else if (month == 12) {
			System.out.println(date + ". Decembris");}
		
		
		
		 
		 
		

	}

}