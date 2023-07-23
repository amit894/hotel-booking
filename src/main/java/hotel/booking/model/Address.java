package hotel.booking.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;


@Entity
public class Address {

    @NotNull @NotEmpty @NotBlank
    private String streetAddress;
    @NotNull @NotEmpty @NotBlank
    private String city;
    @NotNull @NotEmpty @NotBlank
    private String state;
    @NotNull @NotEmpty @NotBlank
    private String postalCode;
    @NotNull @NotEmpty @NotBlank
    private String country;
}
