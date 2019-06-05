package com.carlos.weightlossprogram.weightloss.weightloss

import spock.lang.Specification

class WeightPayloadServiceTest extends Specification {
    def "Given a starting weight and goal weight, return the number of weeks it takes to reach the goal weight"() {
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
