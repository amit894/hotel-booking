package hotel.booking.controller;

import hotel.booking.dto.request.HotelRequest;
import hotel.booking.dto.response.HotelResponse;
import hotel.booking.services.HotelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class HotelController {

    private HotelService hotelService;

    @PostMapping("/register/hotel")
    ResponseEntity <HotelResponse> registerHotel (@RequestBody HotelRequest hotelRequest){
        HotelResponse res = hotelService.registerHotel(hotelRequest);
        return new ResponseEntity<>(res, HttpStatus.CREATED);
    }
}
