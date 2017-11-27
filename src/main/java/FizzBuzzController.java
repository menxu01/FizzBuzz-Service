import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FizzBuzzController {
	
	@RequestMapping("/fizzbuzz/{upperBound}")
	public String fizzBuzz(@PathVariable("upperBound") int upperBound) {
		return FizzBuzz.getResult(upperBound).toString();
	}
}
