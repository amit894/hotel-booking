package hotel.booking.controller;

import hotel.booking.dto.request.ReservationRequest;
import hotel.booking.dto.response.ReservationResponse;
import hotel.booking.services.ReservationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.*;

public class ReservationController {

    private ReservationService reservationService;

    @PostMapping("/book/{roomId}")
    ResponseEntity <ReservationResponse> createReservation (@RequestBody ReservationRequest reservationRequest, @PathVariable("roomId") Long roomId){
        ReservationResponse res = reservationService.createReservation(roomId, reservationRequest);
        return  new ResponseEntity<>(res, HttpStatus.CREATED);
    }

    @PostMapping("/cancel/{reservationId}")
    ResponseEntity <String> cancelReservation (@PathVariable("reservationId") Long reservationId){
        String res = reservationService.cancelReservation(reservationId);
        return new ResponseEntity<>(res, HttpStatus.ACCEPTED);
    }

    @GetMapping ("/get/by-customer")
    ResponseEntity <List<ReservationResponse>> getReservationByCustomer (){
        List<ReservationResponse>res = reservationService.getReservationofCustomer();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @GetMapping ("/get/by-hotel")
    ResponseEntity <List<ReservationResponse>> getReservationByHotel (){
        List<ReservationResponse>res = reservationService.getReservationofHotel();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

}
