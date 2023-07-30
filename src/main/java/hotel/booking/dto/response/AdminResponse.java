package hotel.booking.dto.response;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AdminResponse {

    private Integer adminId;
    private String name;
    private String email;
    private String mobile;
    private String password;

}
