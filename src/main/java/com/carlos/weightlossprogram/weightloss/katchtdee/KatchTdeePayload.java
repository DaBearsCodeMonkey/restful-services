package com.carlos.weightlossprogram.weightloss.katchtdee;

import com.fasterxml.jackson.annotation.JsonProperty;

class KatchTdeePayload {
    @JsonProperty private int bodyFatPercentage;
    @JsonProperty private int weight;

    public int getBodyFatPercentage() {
        return bodyFatPercentage;
    }

    public int getWeight() {
        return weight;
    }
}
