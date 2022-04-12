package es.us.isa.ideas.controller.plaintxt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PlainTXT4IdeasModuleApplication
  extends SpringBootServletInitializer {

  public static void main(String[] args) {
    SpringApplication.run(PlainTXT4IdeasModuleApplication.class, args);
  }

  @Override
  protected SpringApplicationBuilder configure(
    SpringApplicationBuilder builder
  ) {
    return builder.sources(PlainTXT4IdeasModuleApplication.class);
  }
}
