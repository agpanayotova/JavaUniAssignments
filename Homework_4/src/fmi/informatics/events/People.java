package fmi.informatics.events;

import java.util.ArrayList;
import java.util.List;

public class People implements Observable {
	
	private List<Observer> people = new ArrayList<>();
	private boolean isHere;

	@Override
	public void addObserver(Observer o) {
		people.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		people.remove(o);
	}

	@Override
	public void notifyObserver() {
		for(Observer person : people) {
		//	System.out.println(person.toString() + " is greeting " + );
			person.update(); // not allowed to remove elements from the list at this time
		}
	}

	public boolean isHere() {
		return isHere;
	}

	public void setIsHere(boolean inStock) {
		this.isHere = isHere;
		if (isHere) notifyObserver();
	}
}