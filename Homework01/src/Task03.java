import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ievadi veselu skaitli: ");
		int a;
		a = scanner.nextInt();
	
		System.out.println("Ievadi skaitli ar komatu: ");
		double b;
		b = scanner.nextDouble();
		double c = a + b;
		double d = a - b;
		double e = a / b;
		double f = a * b;
		double g = c * c;
		
		
		
		System.out.println("a + b summa: " + c);
		System.out.println("a - b starp�ba: " + d);
		System.out.println("a / b dal�jums: " + e);
		System.out.println("a * b reizin�jums: " + f);
		System.out.println("(a + b)� kvadr�ts: " + g);
	}

}
