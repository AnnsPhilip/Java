public class IntegerToString {

	public static void main(String args[]) {

		int num = 83763575;
		System.out.println(method1(num));

	}

	// Convert integer to string using java.lang.Integer
	public static String method1(int num) {
		String result = Integer.toString(num);

		return result;
	}

	// String concatenation
	public static String method2(int num) {
		String result = num + "";

		return result;
	}

	// Convert integer to string using java.lang.String valueOf()
	public static String method3(int num) {
		String result = String.valueOf(num);

		return result;
	}

	// Convert integer to string using toString()
	// The constructor Integer(int) has been deprecated since version 9 and marked
	// for removal
	public static String method4(int num) {
		String result = new Integer(num).toString();

		return result;
	}

	// Convert integer to string using StringBuffer
	public static String method5(int num) {
		StringBuffer sb = new StringBuffer();
		sb.append(num);

		return sb.toString();
	}

	// Convert integer to string using String format()
	// '%d' format specifier is used for formatting integers or longs as decimal
	// numbers in strings
	public static String method6(int num) {
		String result = String.format("%d", num);

		return result;
	}
}
