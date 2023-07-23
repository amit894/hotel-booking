package hotel.booking.repository;

import hotel.booking.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.*;

public interface CustomerDao extends  JpaRepository<Customer, Long{

    Optional<Customer> findByEmail(String email);
    List<Customer> findByToBeDeleted(Boolean toBeDeleted);
    Integer setCustomerEmail(Long customerId, String email);
    Integer setCustomerPhone(Long customerId, String phone);




}
