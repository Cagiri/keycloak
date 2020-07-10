package tr.com.allianz.authenticator;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import lombok.extern.slf4j.Slf4j;

@Slf4j(topic="ServletInitializer")
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		log.info("SpringApplicationBuilder initialized" );
		return application.sources(AuthenticatorApplication.class);
	}

}
