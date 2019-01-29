package io.micronaut.configuration.rabbitmq

import org.testcontainers.containers.GenericContainer
import org.testcontainers.containers.wait.strategy.LogMessageWaitStrategy
import spock.lang.Specification

abstract class AbstractRabbitMQTest extends Specification {

    static GenericContainer rabbitContainer =
            new GenericContainer("library/rabbitmq:3.7")
                    .withExposedPorts(5672)
                    .waitingFor(new LogMessageWaitStrategy().withRegEx("(?s).*Server startup complete.*"))

    static {
        rabbitContainer.start()
    }
}
