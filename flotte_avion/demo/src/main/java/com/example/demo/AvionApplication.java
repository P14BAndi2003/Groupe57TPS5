package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
@CrossOrigin
public class AvionApplication {
	// @Bean
    // public WebMvcConfigurer corsConfigurer(){
    //     return new WebMvcConfigurer() {
    //         @Override
    //         public void addCorsMappings(CorsRegistry registry) {
    //             WebMvcConfigurer.super.addCorsMappings(registry);
    //             registry.addMapping("/**").allowedOrigins("GET","POST","PUT","DELETE","OPTIONS").allowedMethods("*").allowedHeaders("*").maxAge(-1).allowCredentials(false);
    //         }
    //     };
    // }
	public static void main(String[] args) {
		SpringApplication.run(AvionApplication.class, args);
	}
	// @GetMapping("/coucou")
	// public String hello() {
	// 	return "hello world";
	// }


}
