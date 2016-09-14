package domain;

import javax.persistence.*;

/**
 * Created by r.pogorelov on 14.09.2016.
 */
@Entity
@Inheritance
@DiscriminatorColumn
public abstract class Doctor {
    @Id
    @GeneratedValue
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column
    private String name;
}
