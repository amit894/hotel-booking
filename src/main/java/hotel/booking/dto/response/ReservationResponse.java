package hotel.booking.dto.response;

import hotel.booking.enums.ReservationStatus;
import hotel.booking.model.Customer;
import hotel.booking.model.Room;

import javax.persistence.Enumerated;
import java.time.*;
import java.util.List;

public class ReservationResponse {

    private LocalDate checkinDate;
    private LocalDate checkoutDate;
    private Integer noOfPerson;
    private List<Room> rooms;
    private Customer customer;
    private long resevrationId;
    private LocalDateTime reservationTime;
    private ReservationStatus status;


}
