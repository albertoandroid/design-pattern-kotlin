package behavioral.command

class CreditCardActivateCommand(creditCardReceiver: CreditCardReceiver): Command {

    var creditCardReceiver: CreditCardReceiver

    init {
        this.creditCardReceiver = creditCardReceiver
    }

    override fun execute() {
        creditCardReceiver.sendPINNumberToCustomer()
        creditCardReceiver.activate()
        creditCardReceiver.sendSMSToCustomerActivate()
    }

}