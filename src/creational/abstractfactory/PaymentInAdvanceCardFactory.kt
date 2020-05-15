package creational.abstractfactory

class PaymentInAdvanceCardFactory: AbstractFactory {
    override fun createPayment(): Payment {
        return CardPayment()
    }

    override fun createMethod(): Method {
        return PaymentInAdvanceMethod()
    }
}