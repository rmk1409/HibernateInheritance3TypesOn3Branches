package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * Created by r.pogorelov on 14.09.2016.
 */
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Surgeon extends Doctor {
    @Column(name = "amount_of_removed_limbs")
    private int amountOfRemovedLimbs;
    @Column(name = "amount_of_replaced_limbs")
    private int amountOfReplacedLimbs;

    public int getAmountOfRemovedLimbs() {
        return amountOfRemovedLimbs;
    }

    public void setAmountOfRemovedLimbs(int amountOfRemovedLimbs) {
        this.amountOfRemovedLimbs = amountOfRemovedLimbs;
    }

    public int getAmountOfReplacedLimbs() {
        return amountOfReplacedLimbs;
    }

    public void setAmountOfReplacedLimbs(int amountOfReplacedLimbs) {
        this.amountOfReplacedLimbs = amountOfReplacedLimbs;
    }
}
