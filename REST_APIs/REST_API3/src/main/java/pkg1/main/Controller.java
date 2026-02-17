package pkg1.main;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Controller {
	@GetMapping("/hello")
	public String greet() {
		return "Hello World to CS sir";
	}
}
