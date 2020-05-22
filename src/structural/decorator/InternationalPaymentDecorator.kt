package structural.decorator

class InternationalPaymentDecorator(decorator: CreditComponent): CreditDecorator(decorator) {

    override fun showCredit() {
        decorated.showCredit()
        configInternationalPayment()
    }

    fun configInternationalPayment(){
        System.out.println("Tarjeta Configurada con pago Internacional")
    }
}