
public class string {

	public static void main(String[] args) {
		

		String str = "Java Coding School";
		System.out.println("str: " + str);
		String strConcat = str.concat(" is COOL!");
		//System.out.println("str after concat: " + str);
		//System.out.println("strConcat " + strConcat);
	
		System.out.println(str.toUpperCase());
		System.out.println(str.substring(5));
		System.out.println(str.substring(5, str.length()));
		System.out.println(str.equals("ab"));
	}

}
