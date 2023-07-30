package hotel.booking.model;


import hotel.booking.enums.RoomType;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.*;


@Entity
public class Room {

    @NotNull
    private long roomId;

    @NotNull
    private int roomNumber;

    @Enumerated
    private RoomType roomType;

    @NotNull
    private float costOfRoom;

    @NotNull
    private int numberOfPeople;

    @OneToMany
    private List<Reservation> reservations;

    @ManyToOne
    private Hotel hotel;



}
