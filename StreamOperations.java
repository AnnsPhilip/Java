import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		// forEach
        numbers.stream().forEach(System.out::println);
		
		// Filter
        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("Even Numbers in the list: "+evenNumbers);
		
		
		// Map
        List<Integer> squaredNumbers = numbers.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println("Squared Numbers in the list: "+squaredNumbers);
		
        // Sorted
        List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted Numbers in the list: "+sortedNumbers);
        
        
        // Collect
        List<Integer> collectedNumbers = numbers.stream().collect(Collectors.toList());
		System.out.println("Collected Numbers in the list: " + collectedNumbers);

		// count
		long count = numbers.stream().count();
		System.out.println("List Count : " + count);

		// anyMatch
		boolean hasEvenNumber = numbers.stream().anyMatch(n -> n % 2 == 0);
		System.out.println("Has Even Number : " + hasEvenNumber);

		// reduce
		int sum = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println("Sum : " + sum);

		// min
		int minNumber = numbers.stream().min(Integer::compareTo).orElse(0);
		System.out.println("Min Number : " + minNumber);

		// max
		int maxNumber = numbers.stream().max(Integer::compareTo).orElse(0);
		System.out.println("Max Number : " + maxNumber);

		// allMatch
		boolean allPositive = numbers.stream().allMatch(n -> n > 0);
		System.out.println("Is all positive Number : " + allPositive);

		// noneMatch
		boolean noNegativeNumbers = numbers.stream().noneMatch(n -> n < 0);
		System.out.println("No negative number : " + noNegativeNumbers);

		// findFirst
		Integer firstNumber = numbers.stream().findFirst().orElse(0);
		System.out.println("First Number : " + firstNumber);

		// findAny
		Integer anyNumber = numbers.stream().findAny().orElse(0);
		System.out.println("Any Number present in the list : " + anyNumber);
        
	}

	
}
