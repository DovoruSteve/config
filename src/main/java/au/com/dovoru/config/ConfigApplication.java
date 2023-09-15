package au.com.dovoru.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
@EnableConfigServer
@SpringBootApplication
@PropertySources({
	@PropertySource("classpath:robotserver.properties"),
	@PropertySource("classpath:robotclient.properties")
})
public class ConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
	}

}
