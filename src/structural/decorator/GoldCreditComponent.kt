package structural.decorator

class GoldCreditComponent: CreditComponent {
    override fun showCredit() {
        System.out.println("El credito es de 5.000")
    }
}