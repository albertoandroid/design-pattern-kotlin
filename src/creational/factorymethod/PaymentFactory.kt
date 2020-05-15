package creational.factorymethod

class PaymentFactory {

    companion object{
        fun buildPayment(typePayment: TypePayment): Payment{
            when(typePayment){
                TypePayment.CARD -> return CardPayment()
                TypePayment.GOOGLEPAY -> return GooglePayment()
                else -> return CardPayment()
            }
        }
    }
}