package behavioral.chainresponsability

class BankHandler: ApproveLoanHandler {

    private lateinit var next: ApproveLoanHandler

    override fun setNext(handler: ApproveLoanHandler) {
        next = handler
    }

    override fun getNext(): ApproveLoanHandler {
        return next
    }

    override fun creditCardRequest(totalLoan: Int) {
        val goldHandler = GoldHandler()
        this.setNext(goldHandler)

        val platiniumHandler = PlatiniumHandler()
        goldHandler.setNext(platiniumHandler)

        val blackHandler = BlackHandler()
        platiniumHandler.setNext(blackHandler)

        next.creditCardRequest(totalLoan)
    }
}