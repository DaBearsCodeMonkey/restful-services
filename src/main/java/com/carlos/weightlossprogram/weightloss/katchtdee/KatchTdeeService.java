package com.carlos.weightlossprogram.weightloss.katchtdee;

import com.carlos.weightlossprogram.weightloss.util.Utility;

import javax.inject.Named;
import java.math.BigDecimal;

/* Katch = 370 + (21.6 * LBM(kg))
   where LBM is lean body mass

    TODO: add ability to allow kg or lbs*/

@Named
class KatchTdeeService {

    private final Utility utility = new Utility();

    int getTdee(KatchTdeePayload payload){
        final BigDecimal weightInKilograms = utility.convertLbsToKilos(payload.getWeight());
        final BigDecimal bodyFatPercentage = convertBodyFatToPercent(payload.getBodyFatPercentage());
        final BigDecimal leanBodyMass = getLeanBodyMass(weightInKilograms, bodyFatPercentage);

        return katchFormula(leanBodyMass);
    }

    private BigDecimal getLeanBodyMass(BigDecimal weight, BigDecimal bodyFatPercentage){
        return weight.subtract(weight.multiply(bodyFatPercentage))
                     .setScale(1, BigDecimal.ROUND_HALF_EVEN);
    }

    private BigDecimal convertBodyFatToPercent(int bodyFat){
        final BigDecimal CONST_ONE = BigDecimal.valueOf(100);

        return BigDecimal.valueOf(bodyFat)
                         .divide(CONST_ONE, 2, BigDecimal.ROUND_UNNECESSARY);
    }

    private int katchFormula(BigDecimal leanBodyMass){
        final BigDecimal CONST_ONE = BigDecimal.valueOf(21.6);
        final BigDecimal CONST_TWO = BigDecimal.valueOf(370);

        return CONST_TWO.add(CONST_ONE.multiply(leanBodyMass))
                        .setScale(0, BigDecimal.ROUND_HALF_UP)
                        .intValue();
    }
}
