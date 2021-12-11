package quanlynhahang.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

	public OpenAPI swaggerInfo(
			@Value("${application-version}") String appVersion,
			@Value("${application-name}") String appName) {
		return new OpenAPI().info(new Info().title("Quan Ly Nha Hang")
				.version(appVersion).license(new License().name(appName)));
	}
}
