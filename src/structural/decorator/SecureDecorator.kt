package structural.decorator

class SecureDecorator(decorated: CreditComponent): CreditDecorator(decorated) {

    override fun showCredit() {
        decorated.showCredit()
        configSecure()
    }
    fun configSecure(){
        System.out.println("Tarjeta Configurada de pago Seguro")
    }
}