package hotel.booking.dto.request;
import hotel.booking.model.Address;
import java.time.*;

public class CustomerRequest {

    private String firstName;
    private String lastName;
    private Address address;
    private String email;
    private char [] password;
    private LocalDate dob;


}
