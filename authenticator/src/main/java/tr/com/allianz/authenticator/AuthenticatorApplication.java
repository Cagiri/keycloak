package tr.com.allianz.authenticator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication(exclude = LiquibaseAutoConfiguration.class)
@EnableAutoConfiguration(exclude = LiquibaseAutoConfiguration.class)
@ComponentScan("tr.com.allianz.authenticator")
@Slf4j(topic="AuthenticatorApplication")
public class AuthenticatorApplication {

	public static void main(String[] args) {
		log.info("AuthenticatorApplication initialized" );
		SpringApplication.run(AuthenticatorApplication.class, args);
	}

	
}
