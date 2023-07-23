package hotel.booking.services;
import hotel.booking.dto.request.CustomerRequest;
import hotel.booking.dto.response.CustomerResponse;
import hotel.booking.dto.request.UpdateRequest;
import java.util.*;


public interface CustomerService {
    public CustomerResponse registerCustomer (CustomerRequest customerRequest);
    public String updateMobile (UpdateRequest updateRequest);
    public String updateName (UpdateRequest updateRequest);
    public String updateAddress (UpdateRequest updateRequest);
    public String deleteCustomer(UpdateRequest updateRequest);


    public List<CustomerResponse> getToBeDeletedCustomers();
    public CustomerResponse viewProfile();
}
