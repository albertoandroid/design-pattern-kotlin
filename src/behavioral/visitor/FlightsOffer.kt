package behavioral.visitor

class FlightsOffer: OfferElement {
    override fun accept(visitor: CreditCardVisitor) {
        visitor.flightsOffer(this)
    }
}