package hotel.booking.model;

import hotel.booking.enums.Gender;

import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

public class Customer {

    @NotNull
    private long customerId;

    @NotNull
    private String customerEmail;

    @NotNull
    private String customerMobile;

    @Enumerated
    private Gender gender;

    private String customerName;

    private Date dob;

    private Address address;

    private LocalDateTime registrationDateTime;
    private boolean toBeDeleted;
    private LocalDateTime deletionScheduledAt;

    @OneToMany
    private List<Reservation> reservations;


}
