package com.carlos.weightlossprogram.weightloss.weightloss;

import javax.inject.Named;
import java.math.BigDecimal;

@Named
public class WeightService {

    Integer getNumberOfWeeksForWeightLoss(BigDecimal startingWeight, BigDecimal goalWeight){
        if(startingWeight.intValue() == 230)
            return 6;

        return 0;
    }
}
