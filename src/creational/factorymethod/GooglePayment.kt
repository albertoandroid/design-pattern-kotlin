package creational.factorymethod

class GooglePayment: Payment {
    override fun doPayment() {
        System.out.println("Haciendo pago con Google Payment")
    }
}