package behavioral.chainresponsability

interface ApproveLoanHandler {

    fun setNext(handler: ApproveLoanHandler)
    fun getNext(): ApproveLoanHandler
    fun creditCardRequest(totalLoan: Int)
}