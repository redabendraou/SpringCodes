package helloworld.methodremplacement;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class ReplacerClass implements MethodReplacer {
	@Override
	public Object reimplement(Object bean, Method method, Object[] args) throws Throwable {
		if (isFormatMessageMethod(method)) {
			String msg = (String) args[0];
			return "<h2>" + "inital message:" +msg +" replacer method: hello I am in reimplement method ;)" + "</h2>";
		} else {
			throw new IllegalArgumentException("Unable to reimplement method " + method.getName());
		}
	}

	private boolean isFormatMessageMethod(Method method) {
		if (method.getParameterTypes().length != 1) {
			return false;
		}
		if (!("formatMessage".equals(method.getName()))) {
			return false;
		}
		if (method.getReturnType() != String.class) {
			return false;
		}
		if (method.getParameterTypes()[0] != String.class) {
			return false;
		}
		return true;
	}

}
