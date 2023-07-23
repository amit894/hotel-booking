package hotel.booking.dto.response;
import java.time.*;
import hotel.booking.model.Address;

public class CustomerResponse {
    private Long customerId;

    private String name;

    private String email;

    private String phone;

    private String gender;

    private LocalDate dob;

    private Address address;

    private LocalDateTime registrationDateTime;
}
