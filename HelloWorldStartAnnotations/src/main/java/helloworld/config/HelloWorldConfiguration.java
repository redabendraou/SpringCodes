package helloworld.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import helloworld.provider.HelloWorldMessageProvider;
import helloworld.provider.MessageProvider;
import helloworld.renderer.MessageRenderer;
import helloworld.renderer.StandardOutMessageRenderer;

@Configuration
public class HelloWorldConfiguration {
	// equivalent to <bean id="provider" class=".."/>
	@Bean
	public MessageProvider provider() {
		return new HelloWorldMessageProvider();
	}

	// equivalent to <bean id="renderer" class=".."/>
	@Bean
	public MessageRenderer renderer() {
		MessageRenderer renderer = new StandardOutMessageRenderer();
		renderer.setMessageProvider(provider());
		return renderer;
	}
}
