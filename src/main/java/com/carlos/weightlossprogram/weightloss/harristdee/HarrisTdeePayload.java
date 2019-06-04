package com.carlos.weightlossprogram.weightloss.harristdee;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HarrisTdeePayload {
    @JsonProperty private int heightFeet;
    @JsonProperty private int heightInches;
    @JsonProperty private String formula;
    @JsonProperty private String gender;
}
