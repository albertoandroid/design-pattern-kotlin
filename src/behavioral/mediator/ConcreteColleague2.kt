package behavioral.mediator

class ConcreteColleague2 (override var mediator: Mediator): Colleague(mediator) {
    override fun send(message: String) {
        mediator.send(message, this)
    }

    override fun messageReceived(message: String) {
        System.out.println("El usuario 2 ha recibido el siguiente mensaje: $message")
    }
}