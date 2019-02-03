package io.micronaut.configuration.rabbitmq.docs.exchange

abstract class Animal {

    var name: String? = null

    constructor(name: String) {
        this.name = name
    }

    constructor() {}
}
