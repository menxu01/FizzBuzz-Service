import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * FizzBuzz class contains the function to get the output by processing a given range of number
 * For number that multiples of three, use "Fizz"
 * For number that multiples of five, use "Buzz"
 * For numbers that multiples of both, use "FizzBuzz"
 * Group them by Fizz/Buzz/FizzBuzz
 * 
 * @author meng
 */
public class FizzBuzz {
	
	/**
	 * Generate a range of numbers grouped by Fizz/Buzz/FizzBuzz depending on 
	 * whether the number is multiples of three or five or both.
	 *   
	 * @param upperBound the upper bounder of a range of numbers as an int
	 * @return a map with key as Fizz/Buzz and value as a list of its corresponding numbers
	 */
	public static Map<String, List<Integer>> getResult(int upperBound) {
				
		// take the input numbers as an input stream and 
		// generate a list of items with two properties: the number and its FizzBuzz type 
		@SuppressWarnings("unchecked")
		List<FizzBuzzItem> itemList = (List<FizzBuzzItem>) ((List<?>) IntStream
				.rangeClosed(1, upperBound)
				.mapToObj(i -> {
					if (i % 3 == 0 && i % 5 == 0) {
						return new FizzBuzzItem(i, "\"FizzBuzz\"");
					} else if (i % 3 == 0) {
						return new FizzBuzzItem(i, "\"Fizz\"");
					} else if (i % 5 == 0) {
						return new FizzBuzzItem(i, "\"Buzz\"");
					} else {
						return new FizzBuzzItem(i, "NAi");
					}
				}).collect(Collectors.toCollection(ArrayList::new)));
		
		// group the items by their FizzBuzz property and 
		// return a map with key of FizzBuzz type and value of a list of corresponding numbers
		return itemList.stream()
				.filter(n -> (n.FB != "NA"))
                .collect(Collectors.groupingBy(e -> e.FB, Collectors
                		.mapping(e -> e.num, Collectors.toList())));
	}
}

/**
 * Represents an item with two properties: a number and its FizzBuzz type
 * depending on whether its multiples of three or five or both 
 */
class FizzBuzzItem {
	int num;
	String FB;
	
	/**
	 * Constructor.
	 * @param number given number as int
	 * @param FB corresponding FizzBuzz type of the number as String
	 */
	public FizzBuzzItem(int number, String FB) {
		this.num = number;
		this.FB = FB;
	}
}
