package entity;

import java.math.BigDecimal;

public class Speed {
    BigDecimal speed;

    public Speed() {
    }

    public BigDecimal getSpeed() {
        return speed;
    }

    public void setSpeed(BigDecimal speed) {
        this.speed = speed;
    }

    public Speed(BigDecimal speed) {
        this.speed = speed;
    }
}
