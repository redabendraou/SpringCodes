package helloworld.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import helloworld.renderer.MessageRenderer;

public class MainSpring {
	public static void main(String[] args) {
		//Création de l'application context à partir du fichier XML passé en arg.
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-context.xml");

		//Injection de dépendences, le premier arg correspond à l'id du bean dans l'xml
		MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);

		mr.render();

		//fermeture de la ressource, obligé de caster car ApplicationContext n'offre pas close();
		((ClassPathXmlApplicationContext)ctx).close();
		}


}
