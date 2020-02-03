package fmi.informatics.events;

public class TestEvents {

	public static void main(String[] args) {
		People people = new People();
		Person person = new Person("Ivan", people);

		people.addObserver(person);
		person.talk();
//		people.notifyObserver();
	}
}