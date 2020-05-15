package creational.abstractfactory

class PaymentInAdvanceMethod: Method {
    override fun calculatePayment(): List<String>? {
        System.out.println("Calculando el Pago Adelantado")
        return null
    }
}