package fr.nchantreau.custom.model;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

	@Override
	public String info() {

		return "A great dog";
	}
}