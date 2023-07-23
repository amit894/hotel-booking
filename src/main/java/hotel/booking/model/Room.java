package hotel.booking.model;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.*;


@Entity
public class Room {

    @NotNull
    private long room_id;

    @NotNull
    private String roomType;

    @NotNull
    private boolean isAvailable;

    @NotNull
    private float pricing;

    @NotNull
    private String roomNumber;

    @ManyToOne
    private Hotel hotel;

    @OneToMany
    private List <Reservation> reservations;

}
