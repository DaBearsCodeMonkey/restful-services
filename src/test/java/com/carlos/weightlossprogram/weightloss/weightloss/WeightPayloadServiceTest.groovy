package com.carlos.weightlossprogram.weightloss.weightloss

import spock.lang.Specification

class WeightPayloadServiceTest extends Specification {
    def "GetNumberOfWeeksForWeightLoss"() {
        given:
        def weightService = new WeightService()
        def weight = new WeightPayload(startingWeight, goalWeight)

        when:
        def actualResult = weightService.getNumberOfWeeksForWeightLoss(weight)

        then:
        expectedResult == actualResult

        where:
        startingWeight     | goalWeight         | expectedResult
        (BigDecimal) 150   | (BigDecimal) 150   | 0
        (BigDecimal) 230   | (BigDecimal) 215   | 7
    }
}
