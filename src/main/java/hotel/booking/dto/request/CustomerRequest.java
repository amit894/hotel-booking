package hotel.booking.dto.request;
import hotel.booking.enums.Gender;
import hotel.booking.model.Address;

import javax.persistence.Enumerated;
import java.time.*;

public class CustomerRequest {

   private String name;
   private String email;
   private Address address;
   private String mobile;
   private Gender gender;


}
