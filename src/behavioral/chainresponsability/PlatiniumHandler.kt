package behavioral.chainresponsability

class PlatiniumHandler: ApproveLoanHandler {

    private lateinit var next: ApproveLoanHandler

    override fun setNext(handler: ApproveLoanHandler) {
        next = handler
    }

    override fun getNext(): ApproveLoanHandler {
        return next
    }

    override fun creditCardRequest(totalLoan: Int) {
        if (totalLoan > 10000 && totalLoan <= 50000){
            System.out.println("Esta solicitud de tarjeta la maneja las tipo Platinium")
        } else {
            next.creditCardRequest(totalLoan)
        }
    }
}
