import behavioral.chainresponsability.BankHandler
import behavioral.command.CreditCardActivateCommand
import behavioral.command.CreditCardDesactivateCommand
import behavioral.command.CreditCardInvoker
import behavioral.command.CreditCardReceiver
import behavioral.interpreter.AndExpression
import behavioral.interpreter.OrExpression
import behavioral.interpreter.TerminalExpression
import behavioral.iterator.CardList
import behavioral.mediator.ConcreteColleague1
import behavioral.mediator.ConcreteColleague2
import behavioral.mediator.ConcreteMediator
import behavioral.memento.ArticleMemento
import behavioral.memento.ArticleOriginator
import behavioral.memento.Carataker
import behavioral.observer.Car
import behavioral.observer.MessagePublisher
import behavioral.observer.Pedestrian
import behavioral.observer.TrafficLight
import behavioral.state.MobileAlertStateContext
import behavioral.state.Silent
import behavioral.state.Vibration
import behavioral.strategy.CapitalStrategyTextFormatter
import behavioral.strategy.Context
import behavioral.strategy.LowerStrategyTextFormatter
import behavioral.templatemethod.Paypal
import behavioral.templatemethod.Visa
import behavioral.visitor.BlackCreditCardVisitor
import behavioral.visitor.GassolineOffer
import creational.abstractfactory.MonthlyGoogleFactory
import creational.abstractfactory.PaymentInAdvanceCardFactory
import creational.abstractfactory.PaymentMethodClient
import creational.builder.Card
import creational.factorymethod.Payment
import creational.factorymethod.PaymentFactory
import creational.factorymethod.TypePayment
import creational.prototype.Amex
import creational.singlenton.CardSinglenton
import structural.adapter.Adapter
import structural.adapter.OperationAdaptee
import structural.bridge.ClassicCreditCard
import structural.bridge.SecureCreditCard
import structural.bridge.UnsecureCreditCard
import structural.composite.AccountComposite
import structural.composite.CurrentAccount
import structural.composite.SavingsAccount
import structural.decorator.BlackCreditComponent
import structural.decorator.GoldCreditComponent
import structural.decorator.InternationalPaymentDecorator
import structural.decorator.SecureDecorator
import structural.facade.CreditMarketFacade
import structural.flyweight.Enemy
import structural.flyweight.EnemyFactory
import structural.proxy.ProxyInternet
import java.util.*
import kotlin.time.seconds


fun main(args: Array<String>){
    //testFactoryMethod()
    //testAbstractFactory()
    //testBuilder()
    //testPrototype()
    //testSinglenton()
    //testChainOfResponsability()
    //testCommand()
    //testInterpreter()
    //testIterator()
    //testMediator()
    //testMemento()
    //testObserver()
    //testState()
    //testStrategy()
    //testTemplateMethod()
    //testVisitor()
    //testAdapter()
    //testBridge()
    //testComposite()
    //testDecorator()
    //testFacade()
    //testFlywight()
    testProxy()


}

fun testProxy(){
    var internet = ProxyInternet()
    internet.connectTo("udemy.com")
    internet.connectTo("facebook.com")
}

fun testFlywight(){
    for(i in 0..15){
        val enemy: Enemy? = EnemyFactory.getEnemy(getRandomEnemyType())
        enemy?.setWeapon(getRandomWeapon()!!)
        enemy?.lifePoints()
    }
}

private val enemyType = arrayOf("Private", "Detective")
private val weapon = arrayOf("Fusil", "Pistola", "Revolver","9mm")
fun getRandomEnemyType(): String?{
    val r = Random()
    val randInt: Int = r.nextInt(enemyType.size)
    return enemyType[randInt]
}
fun getRandomWeapon(): String?{
    val r = Random()
    val randInt: Int = r.nextInt(weapon.size)
    return weapon[randInt]
}

fun testFacade(){
    var facade = CreditMarketFacade()
    facade.showCreditBlack()
    facade.showCreditGold()
    facade.showCreditSilver()
}

fun testDecorator(){
    var blackInternationalPayment = InternationalPaymentDecorator(BlackCreditComponent())
    System.out.println("----Tarjeta Black configurada-----")
    blackInternationalPayment.showCredit()

    var goldSecurePayment = SecureDecorator(GoldCreditComponent())
    System.out.println("----Tarjeta Gold configurada-----")
    goldSecurePayment.showCredit()
}



fun testComposite(){
    var savings = SavingsAccount()
    var current = CurrentAccount()

    var composite = AccountComposite()
    composite.addAccount(savings)
    composite.addAccount(current)

    composite.showAccountName()
}

fun testBridge(){
    var classic = ClassicCreditCard(UnsecureCreditCard())
    classic.makePayment()

    classic = ClassicCreditCard(SecureCreditCard())
    classic.makePayment()
}

fun testAdapter(){
    var adaptee = OperationAdaptee(3, 4)
    if(adaptee.sum() == 7){
        System.out.println("ok Int")
    }
    var target = Adapter(adaptee)
    if(target.getSum == "7"){
        System.out.println("ok String")
    }
    System.out.println(target.getSum)

}

fun testVisitor(){
    var oferta = GassolineOffer()
    oferta.accept(BlackCreditCardVisitor())
}

fun testTemplateMethod(){
    var paymentMethodVisa = Visa()
    paymentMethodVisa.makePayment()

    var paymentMethodPaypal = Paypal()
    paymentMethodPaypal.makePayment()

}

fun testStrategy(){
    var context: Context = Context(CapitalStrategyTextFormatter())
    context.publishText("este texto sera convertido a Mayusculas a través de nuestro algoritmo")

    var contextLower = Context(LowerStrategyTextFormatter())
    contextLower.publishText("ESTE TEXTO SERA CONVERTIDO A MINUSCULAS A TRAVÉS DE NUESTRO ALGORITMO")
}

fun testState(){
    var context = MobileAlertStateContext()
    context.alert()
    context.alert()
    Thread.sleep(3000)
    context.setState(Vibration())
    context.alert()
    context.alert()
    Thread.sleep(3000)
    context.setState(Silent())
    context.alert()
    context.alert()
}

fun testObserver(){
    var car = Car()
    var pedestrian = Pedestrian()
    var trafficLight = TrafficLight("CAR_GREEN")
    var messagePublisher = MessagePublisher()
    messagePublisher.attach(car)
    messagePublisher.attach(pedestrian)
    messagePublisher.notifyUpdate(trafficLight)

    Thread.sleep(3000)
    trafficLight.status = "RED_CAR"
    messagePublisher.notifyUpdate(trafficLight)

}

fun testMemento(){
    var carataker = Carataker()
    var article = ArticleOriginator(1, "Memento", "Memento es una pelicula")
    System.out.println(article.text)

    carataker.addMemento(article.createMemento())

    article.text = "Memento es una pelicula de Nolam protagonizada por Guy Pearce"
    System.out.println(article.text)
    carataker.addMemento(article.createMemento())

    var memento1: ArticleMemento = carataker.getMemento(0)
    var memento2: ArticleMemento = carataker.getMemento(1)

    article.restore(memento1)
    System.out.println(article.text)

    article.restore(memento2)
    System.out.println(article.text)


}

fun testMediator(){
    val mediator = ConcreteMediator()
    val user1 = ConcreteColleague1(mediator)
    val user2 = ConcreteColleague2(mediator)

    mediator.setColleague1(user1)
    mediator.setColleague2(user2)

    user1.send("Hola Como estas soy el Usuario 1")
    user2.send("Estoy muy bien, gracias por preguntar.")
}

fun testIterator(){
    val cards: Array<behavioral.iterator.Card?> = arrayOfNulls<behavioral.iterator.Card?>(5)
    cards[0] = behavioral.iterator.Card("VISA")
    cards[1] = behavioral.iterator.Card("AMEX")
    cards[2] = behavioral.iterator.Card("MASTER CARD")
    cards[3] = behavioral.iterator.Card("APPLE CARD")
    cards[4] = behavioral.iterator.Card("GOOGLE CARD")

    val lista = CardList(cards)
    val iterator = lista.iterator()

    while (iterator.hasNext()){
        val tarjeta: behavioral.iterator.Card = iterator.next() as behavioral.iterator.Card
        System.out.println(tarjeta.type)
    }
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