import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author meng
 */
@RestController
public class FizzBuzzController {
	/**
	 * Gets formatted output 
	 * @param upperBound the upper boundary of a range of numbers as int 
	 * @return grouped numbers as String 
	 */
	@RequestMapping("/fizzbuzz/{upperBound}")
	public String fizzBuzz(@PathVariable("upperBound") int upperBound) {
		return FizzBuzz.getResult(upperBound).toString().replaceAll("=", ": ");
	}
}
