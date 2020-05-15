package creational.abstractfactory

class MontlyMethod: Method {
    override fun calculatePayment(): List<String>? {
        System.out.println("Calculando Pago Mensual")
        return null
    }
}