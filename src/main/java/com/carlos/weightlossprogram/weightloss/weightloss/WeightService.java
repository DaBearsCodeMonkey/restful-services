package com.carlos.weightlossprogram.weightloss.weightloss;

import javax.inject.Named;
import java.math.BigDecimal;

@Named
public class WeightService {

    Integer getNumberOfWeeksForWeightLoss(WeightPayload weightPayload){
        final BigDecimal ONE_PERCENT = BigDecimal.valueOf(0.01);
        BigDecimal tempWeight = weightPayload.getStartingWeight();
        Integer numberOfWeeks = 0;

        while(tempWeight.compareTo(weightPayload.getGoalWeight()) > 0){
            numberOfWeeks++;
            tempWeight = tempWeight.subtract(weightPayload.getStartingWeight().multiply(ONE_PERCENT));
        }

        return numberOfWeeks;
    }
}
