package edu.iu.habahram.ducksservice.repository;

import edu.iu.habahram.ducksservice.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, String>
{
    Customer findByUsername(String username);
}
