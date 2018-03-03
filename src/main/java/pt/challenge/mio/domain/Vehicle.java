/**
 * Created by jorge on 02/03/18
 **/
package pt.challenge.mio.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Class Vehicle
 * jorge is an IDIOT because he didn't document this class.
 *
 **/
@Entity
@Table(name="vehicle")
public class Vehicle {

    private String id;
    private String model;
    private String fuelType;
    private String transmission;
    private List<Availability> availabilities;

    @Id
    @Column
    public String getId() {
        return id;
    }

    @Column
    public String getFuelType() {
        return fuelType;
    }

    @Column
    public String getModel() {
        return model;
    }

    @Column
    public String getTransmission() {
        return transmission;
    }

    @Column
    @OneToMany(fetch = FetchType.LAZY)
    public List<Availability> getAvailabilities() {
        return availabilities;
    }

}
