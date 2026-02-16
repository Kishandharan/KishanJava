package pkg1.main;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.ArrayList;

@RestController
public class ApiController {
	@GetMapping("/multiples1/{num1}")
	public ArrayList<Integer> multiples1(@PathVariable int num1){
		ArrayList<Integer> multiples = new ArrayList<Integer>();
		for(int i = 1; i<101; i++) {
			multiples.add(num1*i);			
		}
		return multiples;
	}
	
	@GetMapping("/multiples2/{start1}/{end1}")
	public ArrayList<ArrayList<Integer>> multiples2(@PathVariable int start1, @PathVariable int end1){
		ArrayList<ArrayList<Integer>> multiples = new ArrayList<>();
		for(int i = start1; i<end1+1; i++) {
			ArrayList<Integer> multiple = new ArrayList<>();
			for(int j = 0; j<100; j++) {
				multiple.add(i*j);
			}
			multiples.add(multiple);
		}
		return multiples;
	}
}
