package hotel.booking.model;


import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


@Entity
public class Room {

    @NotNull
    private String RoomNumber;

    @NotNull
    private String RoomType;

    private Integer number_of_people;

    private long roomId;

    private boolean availability;

    private float price;


}
