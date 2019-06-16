package com.carlos.weightlossprogram.weightloss.katchtdee

import spock.lang.Specification

class KatchTdeeServiceTest extends Specification {
    def "Given a weight and body fat percentage, return the lean body mass (weight - body fat percentage)" (){
        given:
        def myObj = new KatchTdeeService()

        when:
        def actualResult = myObj.getLeanBodyMass(weight, bodyFatPercentage)

        then:
        actualResult == expectedResult

        where:
        weight                       | bodyFatPercentage        |   expectedResult
        75 as BigDecimal             | 0.20 as BigDecimal       |   60.0 as BigDecimal
        100 as BigDecimal            | 0.55 as BigDecimal       |   45.0 as BigDecimal
    }

    def "Convert bodyFat integer to percentage"(){
        given:
        def myObj = new KatchTdeeService()

        when:
        def actualResult = myObj.convertBodyFatToPercent(bodyFat)

        then:
        actualResult == expectedResult

        where:
        bodyFat     | expectedResult
        30          | 0.30 as BigDecimal
        60          | 0.60 as BigDecimal
        23          | 0.23 as BigDecimal
        5           | 0.05 as BigDecimal
        95          | 0.95 as BigDecimal
    }

    def "Get tdee using Katch Formula"(){
        given:
        def myObj = new KatchTdeeService()

        when:
        def actualResult = myObj.katchFormula(leanBodyMass)

        then:
        actualResult == expectedResult

        where:
        leanBodyMass                 | expectedResult
        70 as BigDecimal             | 1882
        120 as BigDecimal            | 2962
        87 as BigDecimal             | 2249
    }
}
