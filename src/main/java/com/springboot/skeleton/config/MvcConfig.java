package com.springboot.skeleton.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("site.welcome");
        registry.addViewController("/welcome").setViewName("site.welcome");
        registry.addViewController("/registration").setViewName("site.registration");
        registry.addViewController("/login").setViewName("site.login");
    }

}
