package m.chebbi.tech.batchprocessing.repository;

import m.chebbi.tech.batchprocessing.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
