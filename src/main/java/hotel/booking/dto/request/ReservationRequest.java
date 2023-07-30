package hotel.booking.dto.request;
import java.time.*;
import java.util.*;

import hotel.booking.model.Customer;
import hotel.booking.model.Room;

public class ReservationRequest {
    private LocalDate checkinDate;
    private LocalDate checkoutDate;
    private Integer noOfPerson;
    private List<Room> rooms;
    private Customer customer;
}
