package behavioral.visitor

interface OfferElement {
    fun accept(visitor: CreditCardVisitor)
}