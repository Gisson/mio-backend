/**
 * Created by jorge on 02/03/18
 **/
package pt.challenge.mio.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Class Availability
 * jorge is an IDIOT because he didn't document this class.
 *
 **/
@Entity
@Table(name="availability")
public class Availability {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String day;
    private List<String> hour;

    @Column
    public String getDay() {
        return day;
    }

    @Column
    public List<String> getHour() {
        return hour;
    }
}
