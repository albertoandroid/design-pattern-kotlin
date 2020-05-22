package structural.composite

class SavingsAccount: AccountComponent {
    override fun showAccountName() {
        System.out.println("Cuenta Ahorro")
    }
}