package com.carlos.weightlossprogram.weightloss.weightloss;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class WeightPayload {
    @JsonProperty private BigDecimal startingWeight;
    @JsonProperty private BigDecimal goalWeight;

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
}
