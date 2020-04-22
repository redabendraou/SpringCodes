package helloworld.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionsInjections {

	private Map<String, Object> map;
	private Properties props;
	private Set<?> set;
	private List<?> list;

	public static void main(String... args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:app-context-collections.xml");
		ctx.refresh();
		CollectionsInjections instance = (CollectionsInjections) ctx.getBean("injectCollection");
		instance.displayInfo();
		ctx.close();
	}

	public void displayInfo() {
		System.out.println("Map contents:\n");
		map.entrySet().stream().forEach(e -> System.out.println("Key: " + e.getKey() + " - Value: " + e.getValue()));
		System.out.println("\nProperties contents:\n");
		props.entrySet().stream().forEach(e -> System.out.println("Key: " + e.getKey() + " - Value: " + e.getValue()));
		System.out.println("\nSet contents:\n");
		set.forEach(obj -> System.out.println("Value: " + obj));
		System.out.println("\nList contents:\n");
		list.forEach(obj -> System.out.println("Value: " + obj));
		
	}

	public void setList(List<?> list) {
		this.list = list;
	}

	public void setSet(Set<?> set) {
		this.set = set;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

}
