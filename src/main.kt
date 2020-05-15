import creational.abstractfactory.MonthlyGoogleFactory
import creational.abstractfactory.PaymentInAdvanceCardFactory
import creational.abstractfactory.PaymentMethodClient
import creational.builder.Card
import creational.factorymethod.Payment
import creational.factorymethod.PaymentFactory
import creational.factorymethod.TypePayment
import creational.prototype.Amex

fun main(args: Array<String>){
    //testFactoryMethod()
    //testAbstractFactory()
    //testBuilder()
    testPrototype()

}

fun testPrototype(){
    var original = Amex()
    var copy = original.clone() as? Amex

    System.out.println(original.type)
    System.out.println(copy!!.type)
}

fun testBuilder(){
    var card = Card.CardBuilder("VISA", "1111 2222 3333 4444")
            .credit(false)
            .expires(2030)
            .name("Alberto")
            .build()

    System.out.println(card.toString())
}

fun testAbstractFactory(){
    PaymentMethodClient.someClientCode(PaymentInAdvanceCardFactory())

    PaymentMethodClient.someClientCode(MonthlyGoogleFactory())
}

fun testFactoryMethod(){
    var payment: Payment
    payment = PaymentFactory.buildPayment(TypePayment.GOOGLEPAY)
    payment.doPayment()
}