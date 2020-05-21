package behavioral.visitor

interface CreditCardVisitor {
    fun gassolineOffer(gassolineOffer: GassolineOffer)
    fun flightsOffer(flightsOffer: FlightsOffer)
}