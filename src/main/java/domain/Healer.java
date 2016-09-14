package domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by r.pogorelov on 14.09.2016.
 */
@Entity
@DiscriminatorValue(value = "healer")
public class Healer extends Doctor {
    @Column(name = "amount_of_herbs")
    private int amountOfHerbs;

    public int getAmountOfHerbs() {
        return amountOfHerbs;
    }

    public void setAmountOfHerbs(int amountOfHerbs) {
        this.amountOfHerbs = amountOfHerbs;
    }
}
