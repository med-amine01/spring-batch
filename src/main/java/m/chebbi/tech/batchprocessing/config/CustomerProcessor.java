package m.chebbi.tech.batchprocessing.config;

import m.chebbi.tech.batchprocessing.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {
    @Override
    public Customer process(Customer customer) throws Exception {
        if (customer.getCountry().equals("United States")) {
            return customer;
        }

        return null;
    }
}
