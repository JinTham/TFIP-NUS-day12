package tfip.ssf.day12;

import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day12Application {

	public static void main(String[] args) {
		SpringApplication.run(Day12Application.class, args);
		// SpringApplication app= new SpringApplication(Day12Application.class);

		// String port = "3000";
		// ApplicationArguments cliOpts= new DefaultApplicationArguments(args);
		// if (cliOpts.containsOption("port")){
		// 	port= cliOpts.getOptionValues("port").get(0); // get the first value
		// }	
		// app.setDefaultProperties(Collections.singletonMap("server.port", port));
		// System.out.printf("Application started on port %d\n",port);
		// app.run(args);
	}
}
