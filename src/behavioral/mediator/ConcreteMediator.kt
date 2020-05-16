package behavioral.mediator

class ConcreteMediator: Mediator{
    lateinit var user1: ConcreteColleague1
    lateinit var user2: ConcreteColleague2

    fun setColleague1(colleague1: ConcreteColleague1){
        user1 = colleague1
    }

    fun setColleague2(colleague2: ConcreteColleague2){
        user2 = colleague2
    }

    override fun send(message: String, colleague: Colleague) {
        if(colleague.equals(user1)){
            user2.messageReceived(message)
        } else if (colleague.equals(user2)){
            user1.messageReceived(message)
        }

    }
}