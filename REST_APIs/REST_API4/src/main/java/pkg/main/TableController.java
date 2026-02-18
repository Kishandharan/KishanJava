package pkg.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TableController {
	@GetMapping("/hello")
	public String greet() {
		return "Hello World";
	}
}
