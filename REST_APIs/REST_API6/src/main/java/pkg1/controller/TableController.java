package pkg1.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class TableController {
	
	@GetMapping("/table3")
	public String table3() {
		String str1 = "";
		
		for(int i = 1; i<12; i+=1) {
			str1 += "3 x "+i+" = "+(3*i)+"\n";
		}
		
		return str1;
	}
	
	@GetMapping("/table/{num1}")
	public String table3a(@PathVariable int num1) {
		String str1 = "";
		
		for(int i = 1; i<12; i+=1) {
			str1 += num1+" x "+i+" = "+(num1*i)+"\n";
		}
		
		return str1;
	}
}
