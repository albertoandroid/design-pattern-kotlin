package structural.decorator

class BlackCreditComponent: CreditComponent {
    override fun showCredit() {
        System.out.println("El Credito es del 1.000.000")
    }
}