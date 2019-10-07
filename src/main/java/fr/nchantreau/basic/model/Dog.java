package fr.nchantreau.basic.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("dog")
public class Dog implements Animal {

	@Override
	public String info() {

		return "A great dog";
	}
}