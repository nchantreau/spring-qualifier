package fr.nchantreau.basic.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cat")
public class Cat implements Animal {

	@Override
	public String info() {

		return "A tiny cat";
	}
}