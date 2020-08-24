package com.lti;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Customer;
import com.lti.repository.CustomerRepository;

@SpringBootTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
class  LoanServerApplicationTests {

	@Autowired
	CustomerRepository customerRepo;

	@Test
	void add() {
		Customer c = new Customer();
		c.setCustomerName("Raj");
		c.setEmail("raj@example.com");
		c.setPassword("jar");
		c.setDateOfBirth(LocalDate.of(1998, 9, 11));

		customerRepo.save(c);
		// assert missing
	}

	@Test
	void findAll() {
		List<Customer> listOfCustomers = customerRepo.findAll();

		for (Customer c : listOfCustomers) {
			System.out.println(c.getCustomerId() + " , " + c.getCustomerName() + " , " + c.getDateOfBirth() + " , " + c.getEmail());
			;
		}
		// assert missing
	}

	@Test
	void findByEmailAndPassword() {

		long id = customerRepo.findByUsernamePassword("raj@example.com", "jar");
		System.out.println("Customer id is"+id);
		// assert missing
	}
}