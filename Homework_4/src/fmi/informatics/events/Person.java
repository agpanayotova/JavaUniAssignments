package fmi.informatics.events;

public class Person implements Observer {
	
	private String name;
	private Observable observable;
	
	public Person(String name, Observable observable) {
		this.name = name;
		this.observable = observable;
	}

	public String talk() {
		System.out.println("The person " + name + " greets " +
				observable.getClass().getSimpleName());

		return null;
	}

	@Override
	public void update() {
		talk();
	}

}