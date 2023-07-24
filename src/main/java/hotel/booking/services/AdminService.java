package hotel.booking.services;

import hotel.booking.model.Admin;
import hotel.booking.exceptions.AdminException;

public interface AdminService {
    public Admin registerAdmin (Admin admin) throws AdminException ;
}
