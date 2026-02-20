package pkg1.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TableController2 {
	
	@GetMapping("/table3to6")
	public String table3to6() {
		String str1 = "";
		
		for(int j = 3; j<7; j++) {
			for(int i = 1; i<12; i+=1) {
				str1 += j+" x "+i+" = "+(j*i)+"\n";
			}
			str1 += "\n";
		}
		
		return str1;
	}
}
