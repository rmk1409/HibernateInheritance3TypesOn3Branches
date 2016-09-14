package domain;

import javax.persistence.*;

/**
 * Created by r.pogorelov on 14.09.2016.
 */
@Entity
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "id")),
        @AttributeOverride(name = "name", column = @Column(name = "name"))
})
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
