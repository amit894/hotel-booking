package hotel.booking.dto.request;
import java.time.*;

public class ReservationRequest {
    private LocalDate checkinDate;
    private LocalDate checkoutDate;
    private Integer noOfPerson;
}
