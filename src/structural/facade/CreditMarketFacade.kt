package structural.facade

class CreditMarketFacade {
    var black = BlackModule()
    var gold = GoldModule()
    var silver = SilverModule()

    fun showCreditBlack(){
        black.showCredit()
    }

    fun showCreditGold(){
        gold.showCredit()
    }

    fun showCreditSilver(){
        silver.showCredit()
    }
}