package hotel.booking.dto.response;
import java.time.*;

import hotel.booking.enums.Gender;
import hotel.booking.model.Address;

public class CustomerResponse {
    private String name;
    private String email;
    private Address address;
    private String mobile;
    private Gender gender;
    private long customerId;
    private LocalDateTime registrationTime;
}
