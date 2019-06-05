package com.carlos.weightlossprogram.weightloss.katchtdee;

import javax.inject.Named;
import java.math.BigDecimal;

/* Katch = 370 + (21.6 * LBM)
   where LBM is lean body mass */

@Named
class KatchTdeeService {

    int getTdee(){
        return 0;
    }

   //Weight - (weight * bodyfatPercentage) = LBM
    private BigDecimal getLeanBodyMass(){
        return BigDecimal.ZERO;
    }
}
