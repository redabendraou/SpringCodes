package helloworld.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import helloworld.config.HelloWorldConfiguration;
import helloworld.renderer.MessageRenderer;

public class MainSpring {
	public static void main(String[] args) {
		//Cr�ation de l'application context � partir de classe de configuration.
		 ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

		//Injection de d�pendences, le premier arg correspond � l'id du bean dans l'xml
		MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);

		mr.render();

		//fermeture de la ressource, oblig� de caster car ApplicationContext n'offre pas close();
		((AnnotationConfigApplicationContext)ctx).close();
		}


}
