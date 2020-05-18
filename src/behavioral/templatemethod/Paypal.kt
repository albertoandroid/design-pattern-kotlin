package behavioral.templatemethod

class Paypal: PaymentMethod() {
    override fun initialize() {
        System.out.println("Iniciliando el pago con Paypal")
    }

    override fun startPayment() {
        System.out.println("Realiando el pago a tráves de los servidores de paypal")
    }

    override fun endPayment() {
        System.out.println("Finaliando el pago a tráves de los servidores de paypal")
    }
}