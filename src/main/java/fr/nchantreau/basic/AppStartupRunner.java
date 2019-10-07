package fr.nchantreau.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import fr.nchantreau.basic.model.Animal;

@Component
public class AppStartupRunner implements ApplicationRunner {

	private static final Logger logger = LoggerFactory.getLogger(AppStartupRunner.class);

    @Autowired
    @Qualifier("dog")
    private Animal a1;

    @Autowired
    @Qualifier("cat")
    private Animal a2;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.info("{}", a1.info());
		logger.info("{}", a2.info());
	}

}
