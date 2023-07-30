package hotel.booking.services;

import hotel.booking.dto.request.ReservationRequest;
import hotel.booking.dto.response.ReservationResponse;


import java.util.*;

public interface ReservationService {

    public ReservationResponse createReservation (Long roomId, ReservationRequest reservationRequest);
    public String cancelReservation ( Long reservationId);

    public List <ReservationResponse> getReservationbyCustomer (String customerId);
    public List <ReservationResponse> getReservationbyHotel (String hotelId);
    public  ReservationResponse getReservation(Long reservationId);




}
