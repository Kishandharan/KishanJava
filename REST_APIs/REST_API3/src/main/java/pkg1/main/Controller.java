package pkg1.main;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.ArrayList;

@RestController
public class Controller {
	@GetMapping("/hello")
	public String greet() {
		return "Hello World to CS sir";
	}
	
	@GetMapping("/multiples7")
	public ArrayList<Integer> getMultiples7(){
		ArrayList<Integer> multiples7 = new ArrayList<>();
		int product = 0;
		
		for(int i = 1; i<100; i++) {
			product=i*7;
			if(product <= 100) {
				multiples7.add(i*7);
			}else{
				break;
			}
		}
		return multiples7;
	}
	
	@GetMapping("/multiples/{num1}")	
	public ArrayList<Integer> getMultiples(@PathVariable int num1){
		ArrayList<Integer> multiples = new ArrayList<>();
		int product = 0;
		
		for(int i = 1; i<100; i++) {
			product=i*num1;
			if(product <= 100) {
				multiples.add(i*num1);
			}else{
				break;
			}
		}
		return multiples;
	}
}
