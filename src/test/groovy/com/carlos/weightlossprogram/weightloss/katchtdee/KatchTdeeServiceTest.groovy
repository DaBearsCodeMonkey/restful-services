package com.carlos.weightlossprogram.weightloss.katchtdee

import spock.lang.Specification

class KatchTdeeServiceTest extends Specification {
    def "Given a weight and body fat percentage, return the estimated tdee (daily calories your body burns)"() {
        given:
        def myObj = new KatchTdeeService()
        def katchPayload = new KatchTdeePayload(bodyFat, weight)

        when:
        def actualResult = myObj.getTdee(katchPayload)

        then:
        actualResult.equals(expectedResult)

        where:
        weight       | bodyFat    | expectedResult
        150          | 30         | 2638
        270          | 55         | 2994
    }

    def "Given a weight and body fat percentage, return the lean body mass (weight - body fat percentage)" (){
        given:
        def myObj = new KatchTdeeService()
        def katchPayload = new KatchTdeePayload(bodyFat, weight)

        when:
        def actualResult = myObj.getLeanBodyMass(katchPayload)

        then:
        actualResult.equals(expectedResult)

        where:
        weight          | bodyFat        |   expectedResult
        150             | 30             |   105.0 as BigDecimal
        270             | 55             |   121.5 as BigDecimal
    }

    def "Convert weight in pounds to kilograms"(){
        given:
        def myObj = new KatchTdeeService()

        when:
        def actualResult = myObj.convertLbsToKilos(weight)

        then:
        expectedResult == actualResult

        where:
        weight  | expectedResult
        270     | 122.73 as BigDecimal
        130     | 59.09 as BigDecimal
    }
}
