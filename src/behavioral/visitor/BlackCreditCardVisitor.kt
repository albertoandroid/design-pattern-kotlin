package behavioral.visitor

class BlackCreditCardVisitor: CreditCardVisitor {
    override fun gassolineOffer(gassolineOffer: GassolineOffer) {
        System.out.println("Descuento 10% en Gasolina con tu tarjeta Black")
    }

    override fun flightsOffer(flightsOffer: FlightsOffer) {
        System.out.println("Descuento 25% en Vuelos con tu tarjeta Black")
    }
}