package behavioral.visitor

class GassolineOffer: OfferElement {
    override fun accept(visitor: CreditCardVisitor) {
        visitor.gassolineOffer(this)
    }
}