package hotel.booking.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.*;

public class Hotel {

    @Id @GeneratedValue
    private Long hotelId;

    private String name;

    private String hotelEmail;

    private String password;

    private String hotelPhone;

    private String hotelTelephone;


    private Address address;

    @OneToMany
    private List<String> amenities;

    @OneToMany
    private List<Room> rooms;

    @OneToMany
    private List<Reservation> reservations;
}
