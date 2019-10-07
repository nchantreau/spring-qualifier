package fr.nchantreau.custom.config;

import org.springframework.context.annotation.Configuration;

import fr.nchantreau.custom.qualifier.AnimalQualifier;
import fr.nchantreau.factory.model.Animal;
import fr.nchantreau.factory.model.Cat;
import fr.nchantreau.factory.model.Dog;

@Configuration
public class AnimalFactory {

	@AnimalQualifier("dog")
	public Animal createDog() {

		return new Dog();
	}

	@AnimalQualifier("cat")
	public Animal createCat() {

		return new Cat();
	}
}
