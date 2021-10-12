package hpc.billingservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Bill {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate billingDate;
    @OneToMany(mappedBy = "bill")
    private Collection<ProductItem> productItems ;
    @Transient private Customer customer;
    private long customerId;

}
