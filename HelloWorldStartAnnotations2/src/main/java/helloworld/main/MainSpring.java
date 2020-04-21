package helloworld.main;

import org.springframework.context.support.GenericXmlApplicationContext;
import helloworld.renderer.MessageRenderer;

public class MainSpring {
	public static void main(String[] args) {
		
		//GenericXmlApplicationContext est une implémentation de ApplicationContext
		//la difference avec ClassPathXmlApplicationContext et FileSystemXmlApplicationContext 
		//est qu'elle peut charger plusieurs fichier XML, l'un après l'autre
		//et selon la doc Spring=>In case of multiple configuration files, bean definitions in later files will override those defined in earlier files. 
		//This can be leveraged to intentionally override certain bean definitions via an extra configuration file appended to the list.
		GenericXmlApplicationContext ctx =  new GenericXmlApplicationContext();
		//chargement du context
		ctx.load("classpath:app-context-annotations.xml");        
		//si on ne refresh pas le context, une expression Spring sera levée
		ctx.refresh();
		//Injection de dépendences, le premier arg correspond à l'id du bean dans l'xml
		MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);

		mr.render();

		//fermeture de la ressource, obligé de caster car ApplicationContext n'offre pas close();
		ctx.close();
		}


}
