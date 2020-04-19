package helloworld.renderer;

import helloworld.provider.MessageProvider;

public interface MessageRenderer {
	void render();

	void setMessageProvider(MessageProvider provider);

	MessageProvider getMessageProvider();
}