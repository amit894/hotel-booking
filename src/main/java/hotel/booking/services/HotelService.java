package hotel.booking.services;

import hotel.booking.dto.request.HotelRequest;
import hotel.booking.dto.request.UpdateRequest;
import hotel.booking.dto.response.HotelResponse;
import java.util.*;

public interface HotelService {

    public HotelResponse registerHotel (HotelRequest hotelRequest);
    public String updateEmail ( UpdateRequest updateRequest);
    public String updatePhone ( UpdateRequest updateRequest);
    public String updateAddress ( UpdateRequest updateRequest);

    public HotelResponse getHotelById(Long id);
    public List<HotelResponse> getHotelsNearMe();
    public List<HotelResponse> getHotelsInCity(String city);


}
