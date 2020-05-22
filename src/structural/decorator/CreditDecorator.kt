package structural.decorator

open class CreditDecorator(var decorated: CreditComponent): CreditComponent {

    override fun showCredit() {
        decorated.showCredit()
    }
}