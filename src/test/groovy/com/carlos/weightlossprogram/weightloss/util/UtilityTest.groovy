package com.carlos.weightlossprogram.weightloss.util


import spock.lang.Specification

class UtilityTest extends Specification {
    def "Convert weight in pounds to kilograms"(){
        given:
        def myObj = new Utility()

        when:
        def actualResult = myObj.convertLbsToKilos(weight)

        then:
        actualResult == expectedResult

        where:
        weight  | expectedResult
        270     | 122.73 as BigDecimal
        130     | 59.09 as BigDecimal
    }
}
