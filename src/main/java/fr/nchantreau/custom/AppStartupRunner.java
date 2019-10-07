package fr.nchantreau.custom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import fr.nchantreau.custom.model.Animal;
import fr.nchantreau.custom.qualifier.AnimalQualifier;


@Component
public class AppStartupRunner implements ApplicationRunner {

	private static final Logger logger = LoggerFactory.getLogger(AppStartupRunner.class);

    @Autowired
    @AnimalQualifier("dog")
    private Animal a1;

    @Autowired
    @AnimalQualifier("cat")
    private Animal a2;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.info("{}", a1.info());
		logger.info("{}", a2.info());
	}

}
