package behavioral.visitor

class ClassicCreditCardVisitor: CreditCardVisitor {
    override fun gassolineOffer(gassolineOffer: GassolineOffer) {
        System.out.println("Descuento 3% en Gasolina con tu tarjeta Clásica")
    }

    override fun flightsOffer(flightsOffer: FlightsOffer) {
        System.out.println("Descuento 5% en Vuelos con tu tarjeta Clásica")
    }
}