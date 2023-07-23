package hotel.booking.dto.response;

import hotel.booking.enums.ReservationStatus;
import java.time.*;

public class ReservationResponse {

    private Long reservationId;
    private String customerName;
    private Integer roomNumber;
    private String hotelName;
    private LocalDate checkinDate;
    private LocalDate checkoutDate;
    private Integer noOfPerson;
    private ReservationStatus status;
}
