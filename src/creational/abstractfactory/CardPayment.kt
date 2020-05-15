package creational.abstractfactory

class CardPayment: Payment{
    override fun doPayment() {
        System.out.println("Haciendo el pago con Tarjeta Credito")
    }
}