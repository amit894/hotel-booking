package hotel.booking.model;

import java.util.*;

public class Hotel {

    private Long hotelId;
    private String name;
    private String hotelEmail;
    private String password;
    private String hotelPhone;
    private String hotelTelephone;


    private Address address;

    private List<String> amenities;
    private List<Room> rooms;
    private List<Reservation> reservations;
}
