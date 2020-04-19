package helloworld.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import helloworld.renderer.MessageRenderer;

public class MainSpring {
	public static void main(String[] args) {
		//Cr�ation de l'application context � partir du fichier XML pass� en arg.
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-context.xml");

		//Injection de d�pendences, le premier arg correspond � l'id du bean dans l'xml
		MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);

		mr.render();

		//fermeture de la ressource, oblig� de caster car ApplicationContext n'offre pas close();
		((ClassPathXmlApplicationContext)ctx).close();
		}


}
