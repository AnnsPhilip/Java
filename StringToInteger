//  handle potential exceptions when converting strings to integers, 
//  as the string might not always represent a valid integer value
public class StringToInteger {

	public static void main(String[] args) {
		String s = "37537";
		System.out.println("Converted integer value: " + method3(s));
	}

	// Convert string to integer using parseInt()
	public static int method1(String s) {
		int result = Integer.parseInt(s);

		return result;
	}

	// Convert string to integer using valueOf()
	public static int method2(String s) {
		Integer intValue = Integer.valueOf(s);
		int result = intValue.intValue(); // Convert Integer to int

		return result;
	}

	// Convert string to integer using valueOf()
	public static int method3(String s) {
		int result = Integer.decode(s);

		return result;
	}

}
