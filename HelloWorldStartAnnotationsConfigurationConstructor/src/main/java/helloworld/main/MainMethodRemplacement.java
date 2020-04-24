package helloworld.main;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

import helloworld.methodremplacement.TargetClass;

public class MainMethodRemplacement {
	public static void main(String... args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:app-context-methodreplacer.xml");
		ctx.refresh();
		TargetClass replacementTarget = (TargetClass) ctx.getBean("targetClass");
		TargetClass standardTarget = (TargetClass) ctx.getBean("standardTarget");
		displayInfo(replacementTarget);
		displayInfo(standardTarget);
		ctx.close();
	}

	private static void displayInfo(TargetClass target) {
		System.out.println(target.formatMessage("Thanks for playing, try again!"));
		StopWatch stopWatch = new StopWatch();
		stopWatch.start("perfTest");
		for (int x = 0; x < 1000000; x++) {
			@SuppressWarnings("unused")
			String out = target.formatMessage("No filter in my head");
			// commented to not pollute the console
			//System.out.println(out);
		}
		stopWatch.stop();
		System.out.println("1000000 invocations took: " + stopWatch.getTotalTimeMillis() + " ms");
	}
}
