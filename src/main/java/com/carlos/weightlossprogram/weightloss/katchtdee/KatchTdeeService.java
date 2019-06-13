package com.carlos.weightlossprogram.weightloss.katchtdee;

import org.springframework.web.bind.annotation.RequestBody;

import javax.inject.Named;
import java.math.BigDecimal;

/* Katch = 370 + (21.6 * LBM)
   where LBM is lean body mass */

@Named
class KatchTdeeService {

    int getTdee(KatchTdeePayload payload){
        return 0;
    }

   //Weight - (weight * bodyfatPercentage) = LBM
    private BigDecimal getLeanBodyMass(KatchTdeePayload payload){
        return BigDecimal.ZERO;
    }
}
