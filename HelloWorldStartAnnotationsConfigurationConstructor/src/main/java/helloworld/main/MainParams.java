package helloworld.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import helloworld.parametersexample.ParametersInjectionExample;


public class MainParams {

	
	public static void main(String[] args) {
		//Cr�ation de l'application context � partir de classe de configuration.
		// ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext();
		ctx.load("app-context-params.xml");
		ctx.refresh();

		//Injection de d�pendences, le premier arg correspond � l'id du bean dans l'xml
		ParametersInjectionExample parmexp = ctx.getBean("injectParams", ParametersInjectionExample.class);

		System.out.println(parmexp);

		//fermeture de la ressource, oblig� de caster car ApplicationContext n'offre pas close();
		ctx.close();
		}
}
