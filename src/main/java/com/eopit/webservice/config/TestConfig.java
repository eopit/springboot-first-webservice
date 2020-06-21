package com.eopit.webservice.config;

import com.eopit.webservice.entities.User;
import com.eopit.webservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

  @Autowired
  UserRepository userRepository;

  @Override
  public void run(String... args) throws Exception {
    User u1 = new User(null, "Pedro H", "123456", "pedro@gmail.com", "985342323");
    User u2 = new User(null, "Lucass H", "123321", "lucas@gmail.com", "9123456789");

    userRepository.saveAll(Arrays.asList(u1, u2));
  }
}
