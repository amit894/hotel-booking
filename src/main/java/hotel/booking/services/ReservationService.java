package hotel.booking.services;

import hotel.booking.model.Reservation;
import hotel.booking.model.Hotel;
import hotel.booking.model.Customer;
import hotel.booking.dto.request.ReservationRequest;
import hotel.booking.dto.response.ReservationResponse;


import java.util.*;

public interface ReservationService {

    public ReservationResponse CreateReservation (Long RoomNo, ReservationRequest reservationRequest);
    public String cancelReservation(Long reservationId);
    public List<Reservation> getReservationofHotel(Hotel hotelName);
    public List<Reservation> getReservationofCustomer(Customer CustomerName);

}
