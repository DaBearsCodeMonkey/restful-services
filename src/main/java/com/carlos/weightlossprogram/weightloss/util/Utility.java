package com.carlos.weightlossprogram.weightloss.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Utility {
    public BigDecimal convertLbsToKilos(int weight){
        final BigDecimal CONST_ONE = BigDecimal.valueOf(2.2);

        return BigDecimal.valueOf(weight)
                         .divide(CONST_ONE, 2, RoundingMode.HALF_UP);
    }
}
