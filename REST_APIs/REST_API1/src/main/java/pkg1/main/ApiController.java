package pkg1.main;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiController {
	@GetMapping("/HelloWorld")
	public String hello(){
		return "Hello";
	}
}
