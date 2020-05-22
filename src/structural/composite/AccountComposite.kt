package structural.composite

class AccountComposite: AccountComponent {

    var childAccounts: MutableList<AccountComponent> = ArrayList()

    fun addAccount(account: AccountComponent){
        childAccounts.add(account)
    }

    fun removeAccount(account: AccountComponent){
        childAccounts.remove(account)
    }

    override fun showAccountName() {
        for(child in childAccounts){
            child.showAccountName()
        }
    }
}