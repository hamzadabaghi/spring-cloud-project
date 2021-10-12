package hpc.inventoryservice;

import hpc.inventoryservice.entities.Product;
import hpc.inventoryservice.repositories.ProductRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProductRepo productRepo) {
        return args->{

            productRepo.save(new Product(null,"laptoop hp",9000,2));
            productRepo.save(new Product(null,"smartphone iphone",6000,2));
            productRepo.save(new Product(null,"ecran plasma",5000,2));
            productRepo.save(new Product(null,"asus laptop",18000,2));
            productRepo.save(new Product(null,"souris",50,2));
        };
    }
}
