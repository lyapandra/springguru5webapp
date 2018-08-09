package guru.springframework.spring5webapp;

import guru.springframework.spring5webapp.controllers.SimpleController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {
//		SpringApplication.run(Spring5webappApplication.class, args);
		ApplicationContext ctx = SpringApplication.run(Spring5webappApplication.class, args);

		SimpleController controller = (SimpleController) ctx.getBean("simpleController");

		controller.hello();
	}
}
