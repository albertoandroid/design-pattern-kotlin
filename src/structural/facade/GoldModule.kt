package structural.facade

class GoldModule: CreditModule {
    override fun showCredit() {
        System.out.println("La tarjeta Gold tiene un credito de 50.000")
    }
}