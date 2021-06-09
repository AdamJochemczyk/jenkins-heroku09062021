package pl.zajecia.jenkinsheroku09062021;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JenkinsHeroku09062021Application {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsHeroku09062021Application.class, args);
	}

	@GetMapping
	public String get(){
		return "Hello Jenkins!";
	}

}
