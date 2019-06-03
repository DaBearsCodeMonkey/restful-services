package com.carlos.weightlossprogram.weightloss.weightloss

import spock.lang.Specification

class WeightServiceTest extends Specification {
    def "GetNumberOfWeeksForWeightLoss"() {
        given:
        def weightService = new WeightService()

        when:
        def actualResult = weightService.getNumberOfWeeksForWeightLoss(startingWeight, goalWeight)

        then:
        expectedResult == actualResult

        where:
        startingWeight     | goalWeight         | expectedResult
        (BigDecimal) 250   | (BigDecimal) 150   | 0
        (BigDecimal) 230   | (BigDecimal) 215   | 6
    }
}
