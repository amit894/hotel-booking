package hotel.booking.model;

import java.util.*;
import java.time.*;

public class Customer {


    private Long customerId;
    private String name;
    private String email;
    private String password;
    private String phone;
    private String gender;
    private Date dob;
    private Address address;

    private LocalDateTime registrationDateTime;
    private boolean toBeDeleted;
    private LocalDateTime deletionScheduledAt;
    private List<Reservation> reservations;
}
