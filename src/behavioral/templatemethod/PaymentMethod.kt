package behavioral.templatemethod

abstract class PaymentMethod {
    abstract fun initialize()
    abstract fun startPayment()
    abstract fun endPayment()

    fun makePayment(){
        initialize()
        startPayment()
        endPayment()
    }
}