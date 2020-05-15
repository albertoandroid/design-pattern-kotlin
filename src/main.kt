import creational.factorymethod.Payment
import creational.factorymethod.PaymentFactory
import creational.factorymethod.TypePayment

fun main(args: Array<String>){
    testFactoryMethod()
}

fun testFactoryMethod(){
    var payment: Payment
    payment = PaymentFactory.buildPayment(TypePayment.GOOGLEPAY)
    payment.doPayment()
}