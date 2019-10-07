package fr.nchantreau.factory.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.nchantreau.factory.model.Animal;
import fr.nchantreau.factory.model.Cat;
import fr.nchantreau.factory.model.Dog;

@Configuration
public class AnimalFactory {
	@Bean
	@Qualifier("dog")
	public Animal createDog() {

		return new Dog();
	}

	@Bean
	@Qualifier("cat")
	public Animal createCat() {

		return new Cat();
	}
}
