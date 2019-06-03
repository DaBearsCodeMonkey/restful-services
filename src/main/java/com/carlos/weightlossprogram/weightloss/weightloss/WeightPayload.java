package com.carlos.weightlossprogram.weightloss.weightloss;

import java.math.BigDecimal;

public class WeightPayload {
    private BigDecimal startingWeight;
    private BigDecimal goalWeight;

    public WeightPayload() {
    }

    public WeightPayload(BigDecimal startingWeight, BigDecimal goalWeight) {
        this.startingWeight = startingWeight;
        this.goalWeight = goalWeight;
    }

    BigDecimal getStartingWeight() {
        return startingWeight;
    }

    BigDecimal getGoalWeight() {
        return goalWeight;
    }

    public void setStartingWeight(BigDecimal startingWeight) {
        this.startingWeight = startingWeight;
    }

    public void setGoalWeight(BigDecimal goalWeight) {
        this.goalWeight = goalWeight;
    }
}
