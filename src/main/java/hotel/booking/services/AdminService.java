package hotel.booking.services;

import hotel.booking.exceptions.AdminException;
import hotel.booking.dto.request.AdminRequest;
import hotel.booking.dto.response.AdminResponse;

public interface AdminService {
    public AdminResponse registerAdmin(AdminRequest adminRequest) throws AdminException;

}
