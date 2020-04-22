package helloworld.parametersexample;

public class ParametersInjectionExample {

	private String name;
	private int age;
	private float height;
	private boolean programmer;
	private Long ageInSeconds;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public boolean isProgrammer() {
		return programmer;
	}
	public void setProgrammer(boolean programmer) {
		this.programmer = programmer;
	}
	public Long getAgeInSeconds() {
		return ageInSeconds;
	}
	public void setAgeInSeconds(Long ageInSeconds) {
		this.ageInSeconds = ageInSeconds;
	}
	@Override
	public String toString() {
		return "ParametersInjectionExample [name=" + name + ", age=" + age + ", height=" + height + ", programmer="
				+ programmer + ", ageInSeconds=" + ageInSeconds + "]";
	}

	
	
}
