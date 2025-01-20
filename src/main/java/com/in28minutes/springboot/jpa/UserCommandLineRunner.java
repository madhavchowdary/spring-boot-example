package com.in28minutes.springboot.jpa;

import java.util.function.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserCommandLineRunner implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserCommandLineRunner.class);

    @Autowired
    private UserRepository repository;

    public void run(String... args) {

        repository.save(new User("Ranga", "Admin"));
        repository.save(new User("Ravi", "User"));
        repository.save(new User("Satish", "Admin"));
        repository.save(new User("Raghu", "User"));

        repository.findAll()
                .forEach(new Consumer<User>() {
					public void accept(User user) {
						LOGGER.info(user.toString());
					}
				});

        LOGGER.info("Admin users are.....");
        LOGGER.info("____________________");
        repository.findByRole("Admin")
                .forEach(new Consumer<User>() {
					public void accept(User user) {
						LOGGER.info(user.toString());
					}
				});

    }

}