package helloworld.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("configProvider")
public class ConfigurableMessageProvider implements MessageProvider {
	private String message;

	@Autowired
	public ConfigurableMessageProvider(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}
}