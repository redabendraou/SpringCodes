package helloworld.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import helloworld.parametersexample.ParametersInjectionExample;


public class MainParams {

	
	public static void main(String[] args) {
		//Création de l'application context à partir de classe de configuration.
		// ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext();
		ctx.load("app-context-params.xml");
		ctx.refresh();

		//Injection de dépendences, le premier arg correspond à l'id du bean dans l'xml
		ParametersInjectionExample parmexp = ctx.getBean("injectParams", ParametersInjectionExample.class);

		System.out.println(parmexp);

		//fermeture de la ressource, obligé de caster car ApplicationContext n'offre pas close();
		ctx.close();
		}
}
