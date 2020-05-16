package behavioral.mediator

interface Mediator {

    fun send(message: String, colleague: Colleague)
}