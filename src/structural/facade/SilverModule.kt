package structural.facade

class SilverModule: CreditModule {
    override fun showCredit() {
        System.out.println("La tarjeta Silver tiene un credito de 1.000")
    }
}