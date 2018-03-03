/**
 * Created by jorge on 02/03/18
 **/
package pt.challenge.mio.domain;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Class Dealer
 * jorge is an IDIOT because he didn't document this class.
 *
 **/

@Entity
@Table(name="dealer")
public class Dealer {
    private String id;
    private String name;
    private double latitude;
    private double longitude;
    private List<Vehicle> vehicles;
    private List<Date> closed;

    @Column(name="latitude")
    public double getLatitude() {
        return latitude;
    }

    @Column(name="longitude")
    public double getLongitude() {
        return longitude;
    }

    @Id
    @Column(name="id")
    public String getId() {
        return id;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    @Column(name="closed")
    public List<Date> getClosed() {
        return closed;
    }

    @Column
    @OneToMany(fetch = FetchType.LAZY)
    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
