package hotel.booking.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.*;

public class Hotel {

   @Id @GeneratedValue
   private long hotelId;

   private String address;

   private String hotelEmail;

   private String hotelPhoneNumber;

   private String hotelName;

   private List <String> amenities;


   @OneToMany
   private List <Room> room;


   @OneToMany
   private List <Reservation> reservations;


}
