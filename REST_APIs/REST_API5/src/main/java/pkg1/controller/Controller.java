package pkg1.controller;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/hello")
	public String greet() {
		return "Hello World"; 
	}
	@GetMapping("/goodmorning")
	public String goodmorning() {
		return "Good Morning"; 
	}
	@GetMapping("/greet/{message}")
	public String greet(@PathVariable String message) {
		return "Good "+message; 
	}
	@GetMapping("/greet4")
	public String greet4() {
		LocalDateTime ltd1 = LocalDateTime.now();
		return "Good day, the time now is \n"+ltd1.toString();
	}
	@GetMapping("/greet5")
	public String greet5() {
		LocalTime lt1 = LocalTime.now();
		return "Good day, the time now is \n"+lt1.toString();
	}
	@GetMapping("/greet6")
	public String greet6() {
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH");
		String lt2 = LocalTime.now().format(dtf1);
		String response = "Good Morning";
		int hour1 = Integer.parseInt(lt2);
		if(hour1 > 12) {
			response = "Good Afternoon";
			return response+", Time now is "+hour1+" hours";
		}
		return response+", Time now is "+hour1+" hours";
	}
}
