package fr.nchantreau.custom.model;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

	@Override
	public String info() {

		return "A tiny cat";
	}
}