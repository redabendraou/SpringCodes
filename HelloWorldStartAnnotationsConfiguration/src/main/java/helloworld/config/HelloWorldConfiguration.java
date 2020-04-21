package helloworld.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.ImportResource;

//si je veux intégrer une config XML venant de mon legacy, j'utilise l'@ImportResource 
//@ImportResource(locations = {"classpath:spring/app-context-xml.xml"})
@ComponentScan(basePackages = {"helloworld.*"})
@Configuration
public class HelloWorldConfiguration {

	//plus rien dans la classe Java, juste une indication ou scanner les beans
}
