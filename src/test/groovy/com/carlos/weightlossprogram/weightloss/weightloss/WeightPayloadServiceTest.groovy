package com.carlos.weightlossprogram.weightloss.weightloss

import spock.lang.Specification

class WeightPayloadServiceTest extends Specification {
    def "Given a starting weight and goal weight, return the number of weeks it takes to reach the goal weight"() {
        given:
        def weightService = new WeightService()

        when:
        def actualResult = weightService.getNumberOfWeeksForWeightLoss(new WeightPayload(startingWeight, goalWeight))

        then:
        expectedResult == actualResult

        where:
        startingWeight      | goalWeight          | expectedResult
        150 as BigDecimal   | 150 as BigDecimal   | 0
        230 as BigDecimal   | 215 as BigDecimal   | 7
    }
}
