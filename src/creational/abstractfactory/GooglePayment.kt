package creational.abstractfactory

class GooglePayment: Payment {
    override fun doPayment() {
        System.out.println("Haciendo el pago con Google Payment")
    }
}