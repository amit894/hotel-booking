package hotel.booking.services;
import hotel.booking.dto.request.CustomerRequest;
import hotel.booking.dto.response.CustomerResponse;
import hotel.booking.dto.request.UpdateRequest;
import java.util.*;


public interface CustomerService {
    public CustomerResponse registerCustomer (CustomerRequest registerCustomer);
    public String updateEmail ( UpdateRequest updateRequest);
    public String updatePhone ( UpdateRequest updateRequest);
    public String updatePassword (UpdateRequest updateRequest);
    public String deleteCustomer (UpdateRequest updateRequest);

    public CustomerResponse getProfile (Long customerId);

}
