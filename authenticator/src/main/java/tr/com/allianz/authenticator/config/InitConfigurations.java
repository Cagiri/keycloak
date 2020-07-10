package tr.com.allianz.authenticator.config;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j(topic="InitConfigurations")
public class InitConfigurations implements WebApplicationInitializer {
	@Override
    public void onStartup(ServletContext servletContext) throws ServletException {
		log.info("WebApplicationInitializer initialized");
        servletContext.setInitParameter("spring.profiles.active", "release");
    }
}