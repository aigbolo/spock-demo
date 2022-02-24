package com.example.spockdemo

import spock.lang.Specification

class ExampleSpecification extends Specification {

    def "one plus one should equal two"() {
        expect:
            1 + 1 == 2
    }

    def "two plus two should equal four"() {
        given:
            int left = 2
            int right = 2
        when:
            int result = left + right

        then:
        result == 4
    }

    def "remove empty list should throw IndexOutOfBoundsException"() {
        given:
            List<Integer> list = []

        when:
            list.remove(0)

        then:
            thrown(IndexOutOfBoundsException)
    }
}
