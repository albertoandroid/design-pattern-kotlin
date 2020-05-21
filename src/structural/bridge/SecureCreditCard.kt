package structural.bridge

class SecureCreditCard: ICreditCard {
    override fun makePayment() {
        System.out.println("Pago realizado con Protocolo de Máxima Seguridad")
    }
}