package hotel.booking.model;

import hotel.booking.enums.Gender;

import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.*;
import java.time.*;

public class Customer {

    @Id @GeneratedValue
    private Long customerId;

    private String name;

    private String email;

    private String password;

    private String phone;

    @Enumerated
    private Gender gender;

    private Date dob;

    private Address address;

    private LocalDateTime registrationDateTime;
    private boolean toBeDeleted;
    private LocalDateTime deletionScheduledAt;

    @OneToMany
    private List<Reservation> reservations;
}
