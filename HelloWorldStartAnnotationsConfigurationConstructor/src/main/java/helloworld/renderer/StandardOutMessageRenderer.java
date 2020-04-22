package helloworld.renderer;

//import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import helloworld.provider.MessageProvider;


@Service("renderer")
public class StandardOutMessageRenderer implements MessageRenderer {
	private MessageProvider messageProvider;

	@Override
	public void render() {
		if (messageProvider == null) {
			throw new RuntimeException(
					"You must set the property messageProvider of class:" + StandardOutMessageRenderer.class.getName());
		}
		System.out.println(messageProvider.getMessage());
	}

	@Override
	@Autowired
	//je peux aussi utiliser cette annotation � la place d'@Autowired qui fait partie du JSr-250 standard 
	//@Resource
	//Si je veux cibler un bean par son nom, soit je j'utilise @Qualifier, soit @Resource("provider")
	@Qualifier("configProvider")
	//je peux aussi utiliser @Inject � la place d'@Autowired qui fait partie de la Jsr-330 (JEE)
	//@Inject
	public void setMessageProvider(MessageProvider provider) {
		this.messageProvider = provider;
	}

	@Override
	public MessageProvider getMessageProvider() {
		return this.messageProvider;
	}
}
