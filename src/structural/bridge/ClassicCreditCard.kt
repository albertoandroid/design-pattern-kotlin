package structural.bridge

class ClassicCreditCard(var creditCard: ICreditCard): CreditCard(creditCard) {
    override fun makePayment() {
        creditCard.makePayment()
    }
}