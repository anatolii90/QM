package eu.quizmania.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan({"eu.quizmania.controller"})
public class WebAppConfig {

    public final String VIEW_RESOLVER_PREFIX = "/WEB-INF/pages/";
    public final String VIEW_RESOLVER_SUFIX = ".jsp";

    @Bean
    public InternalResourceViewResolver setupViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix(VIEW_RESOLVER_PREFIX);
        resolver.setSuffix(VIEW_RESOLVER_SUFIX);
        resolver.setViewClass(JstlView.class);
        return resolver;
    }

}
