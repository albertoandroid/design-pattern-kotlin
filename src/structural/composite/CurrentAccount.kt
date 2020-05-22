package structural.composite

class CurrentAccount: AccountComponent {
    override fun showAccountName() {
        System.out.println("Cuenta Corriente")
    }
}