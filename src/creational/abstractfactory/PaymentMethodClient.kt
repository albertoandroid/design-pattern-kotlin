package creational.abstractfactory

class PaymentMethodClient {

    companion object{
        fun someClientCode(factory: AbstractFactory){
            var payment = factory.createPayment()
            var method = factory.createMethod()

            payment.doPayment()
            method.calculatePayment()
        }
    }
}