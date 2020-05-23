package structural.facade

class BlackModule: CreditModule {
    override fun showCredit() {
        System.out.println("La tarjeta Black tiene un credito de 1.000.000")
    }
}