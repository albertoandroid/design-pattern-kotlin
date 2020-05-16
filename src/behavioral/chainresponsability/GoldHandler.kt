package behavioral.chainresponsability

class GoldHandler: ApproveLoanHandler {

    private lateinit var next: ApproveLoanHandler

    override fun setNext(handler: ApproveLoanHandler) {
        next = handler
    }

    override fun getNext(): ApproveLoanHandler {
        return next
    }

    override fun creditCardRequest(totalLoan: Int) {
        if (totalLoan <= 10000){
            System.out.println("Esta solicitud de tarjeta la maneja las tipo Gold")
        } else {
            next.creditCardRequest(totalLoan)
        }
    }
}