package microservices.book.gamification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class GamificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamificationApplication.class, args);

		List<List<String>> namesNested = Arrays.asList(
				Arrays.asList("Jeff", "Bezos"),
				Arrays.asList("Bill", "Gates"),
				Arrays.asList("Mark", "Zuckerberg"));

		List<String> convertedListString = namesNested.stream().flatMap(Collection::stream).collect(Collectors.toList());
		System.out.println(convertedListString);
	}
}