package testgroup.filmography.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "testgroup.filmography")
public class WebConfiguration {
    @Bean
    ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("WEB-INF/pages/");//если не помещать в WEB-INF/ то  http://localhost:8080/filmography[/edit] будут возвращать нужную страницу
        viewResolver.setSuffix(".jsp");
        return viewResolver;

    }
}