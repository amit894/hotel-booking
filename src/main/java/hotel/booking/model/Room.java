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

    @Enumerated
    private RoomType roomType;

    private Integer noOfPeople;

    private float cost;

    @ManyToOne
    private Hotel hotel;

    @OneToMany
    private List<Reservation> reservations;


}
