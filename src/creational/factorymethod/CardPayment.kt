package creational.factorymethod

class CardPayment: Payment {
    override fun doPayment() {
        System.out.println("Haciendo pago con Card Payment")
    }
}