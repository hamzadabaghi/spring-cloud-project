package hpc.billingservice.repositories;

import hpc.billingservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductItemRepo  extends JpaRepository<ProductItem,Long> {
}
