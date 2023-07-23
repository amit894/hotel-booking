package hotel.booking.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
public class Admin {

    private Integer adminId;

    @NotNull @NotEmpty @NotBlank
    private String name;

    @NotNull @NotEmpty @NotBlank
    private String email;

    @NotNull @NotEmpty @NotBlank
    private String mobile;

    @NotNull @NotEmpty @NotBlank
    private String password;

}
