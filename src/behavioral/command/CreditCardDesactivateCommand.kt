package behavioral.command

class CreditCardDesactivateCommand(creditCardReceiver: CreditCardReceiver): Command {

    var creditCardReceiver: CreditCardReceiver

    init {
        this.creditCardReceiver = creditCardReceiver
    }

    override fun execute() {
        creditCardReceiver.desactivate()
        creditCardReceiver.sendSMSToCustomerDesactivate()
    }
}