package ch.compsteel.componentSupplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ComponentSupplierApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComponentSupplierApplication.class, args);
	}

}
