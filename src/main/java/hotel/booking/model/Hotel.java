package hotel.booking.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.*;

public class Hotel {

   @NotNull
   private long hotelId;

   @NotNull
   private Address address;

   @NotNull
   private String mobileNumber;

   @NotNull
   private Email email;

   @OneToMany
   private List<Room> rooms;

   @OneToMany
   private List<Reservation> reservations;



}
