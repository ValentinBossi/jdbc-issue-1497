package com.reproduce.issue1497;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class Issue1497ApplicationTests {

	@Autowired
	PersonRepository userRepository;

	@BeforeAll
	void setup() {
		Person user = new Person();
		user.setAge(12);
		user.setName("test");
		userRepository.save(user);
	}

	@Test
	void findUserByName() {
		Person user = userRepository.findByName("test");
		assertEquals("test", user.getName());
	}

}
