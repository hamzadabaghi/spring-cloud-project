package hpc.customerservice;

import hpc.customerservice.entities.Customer;
import hpc.customerservice.repositories.CustomerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepo customerRepo) {

        return args -> {

            customerRepo.save(new Customer(null,"Mouad","mouad@gmail.com"));
            customerRepo.save(new Customer(null,"Hamza","hamza@gmail.com"));
            customerRepo.save(new Customer(null,"Soufiane","soufiane@gmail.com"));
            customerRepo.save(new Customer(null,"Soumaya","soumaya@gmail.com"));
        };
    }
}
