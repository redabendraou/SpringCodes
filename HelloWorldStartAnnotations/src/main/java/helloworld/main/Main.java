package helloworld.main;

import helloworld.provider.HelloWorldMessageProvider;
import helloworld.provider.MessageProvider;
import helloworld.renderer.MessageRenderer;
import helloworld.renderer.StandardOutMessageRenderer;

public class Main {

	public static void main(String[] args) {
		MessageRenderer mr = new StandardOutMessageRenderer();
		MessageProvider mp = new HelloWorldMessageProvider();
		mr.setMessageProvider(mp);
		mr.render();

	}

}
