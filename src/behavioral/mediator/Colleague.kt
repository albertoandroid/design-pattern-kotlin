package behavioral.mediator

abstract class Colleague(open var mediator: Mediator) {
    abstract fun send(message: String)
    abstract fun messageReceived(message: String)
}