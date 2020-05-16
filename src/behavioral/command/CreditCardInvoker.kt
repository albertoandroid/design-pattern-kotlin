package behavioral.command

class CreditCardInvoker {

    private var command: Command? = null

    fun setCommand(command: Command?){
        this.command = command
    }

    fun run(){
        command!!.execute()
    }
}