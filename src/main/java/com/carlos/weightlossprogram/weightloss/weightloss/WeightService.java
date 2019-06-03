package com.carlos.weightlossprogram.weightloss.weightloss;

import javax.inject.Named;
import java.math.BigDecimal;

@Named
public class WeightService {

    Integer getNumberOfWeeksForWeightLoss(BigDecimal weight, BigDecimal goalWeight){
        final BigDecimal ONE_PERCENT = new BigDecimal("0.01");
        Integer numberOfWeeks = 0;

        while(weight.compareTo(goalWeight) > 0){
            numberOfWeeks++;
            weight = weight.subtract(weight.multiply(ONE_PERCENT));
        }

        return numberOfWeeks;
    }
}
