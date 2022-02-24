package com.example.spockdemo.service

import spock.lang.Specification

class GreetingServiceSpecification extends Specification {


    def "greeting should return Hello #name"() {
        when:
            String result = new GreetingService().greeting(name)
        then:
            result == "Hello $name"
        where:
            name << ["Toto","Ig","Mama"]
    }
}
