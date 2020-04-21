package helloworld.provider;

import org.springframework.stereotype.Component;

@Component("evolvedProvider")
public class HelloWorldMessageProviderEvolved implements MessageProvider {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "The evolved version";
	}

}
