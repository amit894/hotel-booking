package hotel.booking.model;

import hotel.booking.dto.Payment;
import hotel.booking.enums.ReservationStatus;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

@Entity
public class Reservation {

    @NotNull
    private long reservationId;

    private LocalDate checkInDate;

    private LocalDate checkOutDate;

    private Integer noOfPeople;

    private Payment payment;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Hotel hotel;

    @ManyToOne
    private Room room;



}
