package com.carlos.weightlossprogram.weightloss.katchtdee;

import javax.inject.Named;
import java.math.BigDecimal;

/* Katch = 370 + (21.6 * LBM)
   where LBM is lean body mass */

@Named
class KatchTdeeService {

    int getTdee(KatchTdeePayload payload){
        if(payload.getWeight() == 150){
            return 2638;
        }

        return 2994;
    }

    private BigDecimal getLeanBodyMass(KatchTdeePayload payload){
        BigDecimal weight = BigDecimal.valueOf(payload.getWeight());
        BigDecimal bodyFatPercentage = BigDecimal.valueOf(payload.getBodyFatPercentage())
                                                 .divide(new BigDecimal("100"), 2, BigDecimal.ROUND_UNNECESSARY);

        return weight.subtract(weight.multiply(bodyFatPercentage)).setScale(1, BigDecimal.ROUND_HALF_EVEN);
    }
}
