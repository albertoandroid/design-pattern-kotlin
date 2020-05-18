package behavioral.templatemethod

class Visa: PaymentMethod() {
    override fun initialize() {
        System.out.println("Iniciliando el pago con VISA")
    }

    override fun startPayment() {
        System.out.println("Realiando el pago a tráves de los servidores de VISA")
    }

    override fun endPayment() {
        System.out.println("Finaliando el pago a tráves de los servidores de VISA")
    }
}