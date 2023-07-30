package hotel.booking.services;

import hotel.booking.dto.request.CustomerRequest;
import hotel.booking.dto.request.HotelRequest;
import hotel.booking.dto.request.UpdateRequest;
import hotel.booking.dto.response.CustomerResponse;
import hotel.booking.dto.response.HotelResponse;
import java.util.*;

public interface HotelService {

    public HotelResponse registerHotel (HotelRequest hotelRequest);
    public String updateEmail (UpdateRequest updateRequest);
    public String updatePhone (UpdateRequest updateRequest);
    public String updatePassword (UpdateRequest updateRequest);

    public HotelResponse getHotelbyId(Long id );
    public List<HotelResponse> getHotelsInCity(String city);

}
