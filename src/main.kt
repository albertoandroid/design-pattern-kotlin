import behavioral.chainresponsability.BankHandler
import behavioral.command.CreditCardActivateCommand
import behavioral.command.CreditCardDesactivateCommand
import behavioral.command.CreditCardInvoker
import behavioral.command.CreditCardReceiver
import behavioral.interpreter.AndExpression
import behavioral.interpreter.OrExpression
import behavioral.interpreter.TerminalExpression
import creational.abstractfactory.MonthlyGoogleFactory
import creational.abstractfactory.PaymentInAdvanceCardFactory
import creational.abstractfactory.PaymentMethodClient
import creational.builder.Card
import creational.factorymethod.Payment
import creational.factorymethod.PaymentFactory
import creational.factorymethod.TypePayment
import creational.prototype.Amex
import creational.singlenton.CardSinglenton


fun main(args: Array<String>){
    //testFactoryMethod()
    //testAbstractFactory()
    //testBuilder()
    //testPrototype()
    //testSinglenton()
    //testChainOfResponsability()
    //testCommand()
    //testInterpreter()

}





fun testInterpreter(){
    val cero = TerminalExpression("0")
    val uno = TerminalExpression("1")

    val constainsOneOrCero = OrExpression(cero, uno)
    System.out.println(constainsOneOrCero.interpret("cero"))
    System.out.println(constainsOneOrCero.interpret("0"))

    val constainsOneAndCero = AndExpression(cero, uno)
    System.out.println(constainsOneAndCero.interpret("cero, 0"))
    System.out.println(constainsOneAndCero.interpret("0, 1"))
}

fun testCommand(){
    val creditCard = CreditCardReceiver()
    val invoker = CreditCardInvoker()
    invoker.setCommand(CreditCardActivateCommand(creditCard))
    invoker.run()

    invoker.setCommand(CreditCardDesactivateCommand(creditCard))
    invoker.run()
}

fun testChainOfResponsability(){
    val bank = BankHandler()
    bank.creditCardRequest(1000000)
}

fun testSinglenton(){
    var instancia1 = CardSinglenton
    var instancia2 = CardSinglenton

    if(instancia1.equals(instancia2)){
        System.out.println("instancia1 es la misma que instancia2")
    }

    instancia1.doSomething()
    instancia2.doSomething()
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