package behavioral.chainresponsability

class BlackHandler: ApproveLoanHandler {

    private lateinit var next: ApproveLoanHandler

    override fun setNext(handler: ApproveLoanHandler) {
        next = handler
    }

    override fun getNext(): ApproveLoanHandler {
        return next
    }

    override fun creditCardRequest(totalLoan: Int) {
        if (totalLoan > 50000){
            System.out.println("Esta solicitud de tarjeta la maneja las tipo Black")
        }
    }
}