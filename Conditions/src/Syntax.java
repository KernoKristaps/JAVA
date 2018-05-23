import java.util.Scanner;

public class Syntax {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ievadi skaitli i1 (0 lidz 10): ");
		int i1 = scanner.nextInt();
		
		System.out.println("Ievadi skaitli i2 (10 lidz 20): ");
		int i2 = scanner.nextInt();
		
		if (i1 >= 0 && i1 <= 10) {
			System.out.println("i1 ir no 0 lidz 10");
		} else {
			System.out.println("i1 nav robeþâ n 0 lidz 10");
		}
		
		if (i2 >= 10 && i2 <= 20) {
			System.out.println("i2 ir no 10 lidz 20");
		} else {
			System.out.println("i2 nav robeþâ n 10 lidz 20");
		}
				
				/*if (someNumber == 10) {
					System.out.println("Ir 10");
				} else {
					System.out.print("Nav 10");
				}
		System.out.println("END");*/

	}

}
