package structural.bridge

class UnsecureCreditCard: ICreditCard {
    override fun makePayment() {
        System.out.println("Pago realizado sin Seguridad")
    }
}