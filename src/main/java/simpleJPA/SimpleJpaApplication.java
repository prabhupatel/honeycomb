package simpleJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.domain.Customer;
import com.repository.CustomerRepository;
import com.service.CustomerService;

//@Configuration
@ComponentScan({"com.service", "com.rest"})
//@EnableAutoConfiguration
@SpringBootApplication
@EntityScan({"com.domain","com.rest"})
@EnableJpaRepositories("com.repository")

public class SimpleJpaApplication implements CommandLineRunner {
//public class SimpleJpaApplication {
	@Autowired
	CustomerService customerService;

	
    public static void main(String[] args) {
        SpringApplication.run(SimpleJpaApplication.class, args);
    }
    
    @Override
    public void run(String... strings) throws Exception {
    	/*System.out.println("Starting............");
    	for (Customer customer :customerService.getAllCustomer()){
    		System.out.println("customer"+customer);
    	}*/
    	System.out.println("deleteByLastNameAndFirstName............");
    	customerService.deleteByLastNameAndFirstName( "Jack", "Bauer");
    	System.out.println("deleteByLastNameAndFirstName............");
    }
}
